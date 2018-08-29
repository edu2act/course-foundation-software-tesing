// FuncRevenueAccount.cpp : Defines the entry point for the console application.
//

//FuncRevenueAccount是一个账单优惠计算的函数，是第6章单元测试的6.7节单元测试环境中的一个实例 
#include "stdio.h"
#include "math.h"

double FuncRevenueAccount( double amount )
{
	double rate = 1.0; // 设置折扣率
	if( amount <= 800 ) // 若账单不高于800元，则无折扣
		rate = 1.0;
	else if( amount > 800 && amount <= 1800 )
		rate = 0.9; // 9折
	else if( amount > 1800 && amount <= 4800 )
		rate = 0.8; // 8折
	else if( amount > 4800 )
		rate = 0.7; // 7折
	else if( amount <= 0 ){ // 否则，赋予一个负数，表示无效
		return -1.0;
	}
	return amount * rate; // 返回经优惠计算之后的账单
}

// 测试驱动程序
void DriveroFuncRevenueAccount()
{
	printf( "这是对FuncRevenueAccount的测试，该函数是6.7节单元测试环境中的一个例子\n" );

	// --------1. 设置局部变量---------
	int tcPassNum = 0;
	int tcFailNum = 0; // 存储通过和失败的测试用例总数

	FILE* pFpFrom = NULL; // 数据文件的指针，存储测试用例的基本信息
	FILE* pFpTo = NULL; // 记录测试用例执行结果的文件的指针

	// --------2. 打开数据文件，准备读取测试用例的数据-----------
	char* DataFileName = "TCData1.txt";
	pFpFrom = fopen( DataFileName, "r" );
	if( !pFpFrom ){
		printf( "读取数据失败，返回\n" );
		return;
	}

	// 打开数据文件，准备记录测试用例执行结果
	char* DataFileTestResultName = "FuncRevenueAccountTestResult.txt";
	pFpTo = fopen( DataFileTestResultName, "w+t" );
	if( !pFpTo )
	{
		printf( "打开文件失败，返回\n" );
		return;
	}
	fprintf( pFpTo, "----------对函数FuncRevenueAccount的单元测试结果-------------\n" );

	// -----------3. 执行测试用例，记录测试结果-----------
	int TCID = 0;
	double originalAmount; // 测试用例的输入
	double expectedOutcome; // 测试用例的预期输出
	double actualOutcome; // 测试用例的实际输出

	printf( "对函数FuncRevenueAccount展开单元测试\n" );
	while( !feof(pFpFrom) ){// 不断读取每个测试用例的数据
		fscanf( pFpFrom, "%d ", &TCID ); // 读入测试用例的ID
		fscanf( pFpFrom, "%lf ", &originalAmount ); // 读入测试用例的输入
		fscanf( pFpFrom, "%lf ", &expectedOutcome );// 读入测试用例的预期输出

		actualOutcome = FuncRevenueAccount( originalAmount );// 执行测试用例
		// 输出测试用例的信息
		printf( "测试用例%d: 输入%lf, 预期输出%lf，实际输出%lf, ", TCID, originalAmount, expectedOutcome, actualOutcome );

		if( fabs(actualOutcome-expectedOutcome) < 1e-6 )// 若测试用例通过，则记录通过的用例总数
		{
			tcPassNum ++;
			printf( "通过\n" );
			// 将测试用例的执行结果存入结果文件
			fprintf( pFpTo, "测试用例%d: Pass\n", TCID );
		}
		else
		{
			tcFailNum ++;
			printf( "失败\n" );
			// 将测试用例的执行结果存入结果文件
			fprintf( pFpTo, "测试用例%d: Fail\n", TCID );
		}
	}
	fclose( pFpFrom );// 关闭测试用例数据文件

	// -----------4. 统计测试结果-----------
	printf( "共执行%d个测试用例，其中%d个通过，%d个失败\n", tcPassNum+tcFailNum, tcPassNum, tcFailNum );
	fprintf( pFpTo, "共执行%d个测试用例，其中%d个通过，%d个失败\n", tcPassNum+tcFailNum, tcPassNum, tcFailNum );

	fclose( pFpTo );// 关闭结果记录文件
}


void main()
{
/*	double amountBefore = 0.0;
	printf( "请输入账单的消费数额（该数额应大于零）：\n" );
	scanf( "%lf", &amountBefore );
	printf( "输入的账单值为%lf, ", amountBefore );
	double amountAfter = 0.0;
	amountAfter = FuncRevenueAccount( amountBefore );
	if( amountAfter <= 0 )
		printf( "\n账单消费数额无效\n" );
	else
		printf( "优惠计算后的账单值为%f\n", amountAfter );
*/
	DriveroFuncRevenueAccount();

}


/*
 * 以下是修改后的函数FuncRevenueAccount
*//*
double FuncRevenueAccount( double amount )
{
	double rate = 1.0; // 设置折扣率
	if( amount>0 && amount <= 800 ) // 若账单不高于800元，则无折扣
		rate = 1.0;
	else if( amount > 800 && amount <= 1800 )
		rate = 0.9; // 9折
	else if( amount > 2000 && amount <= 4800 )
		rate = 0.8; // 8折
	else if( amount > 4800 )
		rate = 0.7; // 7折
	else{ // 否则，赋予一个负数，表示无效
		return -1000.0;
	}
	return amount * rate; // 返回经优惠计算之后的账单
}


int _tmain(int argc, _TCHAR* argv[])
{
	return 0;
}
*/

