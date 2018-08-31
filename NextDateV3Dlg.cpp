// NextDateV3Dlg.cpp : implementation file
//

#include "stdafx.h"
#include "NextDateV3.h"
#include "NextDateV3Dlg.h"

#ifdef _DEBUG
#define new DEBUG_NEW
#undef THIS_FILE
static char THIS_FILE[] = __FILE__;
#endif

/////////////////////////////////////////////////////////////////////////////
// CAboutDlg dialog used for App About

class CAboutDlg : public CDialog
{
public:
	CAboutDlg();

// Dialog Data
	//{{AFX_DATA(CAboutDlg)
	enum { IDD = IDD_ABOUTBOX };
	//}}AFX_DATA

	// ClassWizard generated virtual function overrides
	//{{AFX_VIRTUAL(CAboutDlg)
	protected:
	virtual void DoDataExchange(CDataExchange* pDX);    // DDX/DDV support
	//}}AFX_VIRTUAL

// Implementation
protected:
	//{{AFX_MSG(CAboutDlg)
	//}}AFX_MSG
	DECLARE_MESSAGE_MAP()
};

CAboutDlg::CAboutDlg() : CDialog(CAboutDlg::IDD)
{
	//{{AFX_DATA_INIT(CAboutDlg)
	//}}AFX_DATA_INIT
}

void CAboutDlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(CAboutDlg)
	//}}AFX_DATA_MAP
}

BEGIN_MESSAGE_MAP(CAboutDlg, CDialog)
	//{{AFX_MSG_MAP(CAboutDlg)
		// No message handlers
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// CNextDateV3Dlg dialog

CNextDateV3Dlg::CNextDateV3Dlg(CWnd* pParent /*=NULL*/)
	: CDialog(CNextDateV3Dlg::IDD, pParent)
{
	//{{AFX_DATA_INIT(CNextDateV3Dlg)
	m_nYear = 0;
	m_nMonth = 0;
	m_nDay = 0;
	m_strTomorrow = _T("");
	//}}AFX_DATA_INIT
	// Note that LoadIcon does not require a subsequent DestroyIcon in Win32
	m_hIcon = AfxGetApp()->LoadIcon(IDR_MAINFRAME);
}

void CNextDateV3Dlg::DoDataExchange(CDataExchange* pDX)
{
	CDialog::DoDataExchange(pDX);
	//{{AFX_DATA_MAP(CNextDateV3Dlg)
	DDX_Control(pDX, IDC_EDIT7, m_ctrlTomorrow);
	DDX_Control(pDX, IDC_EDIT3, m_ctrlDay);
	DDX_Control(pDX, IDC_EDIT2, m_ctrlMonth);
	DDX_Control(pDX, IDC_EDIT1, m_ctrlYear);
	DDX_Text(pDX, IDC_EDIT1, m_nYear);
	DDV_MinMaxInt(pDX, m_nYear, 1800, 2050);
	DDX_Text(pDX, IDC_EDIT2, m_nMonth);
	DDV_MinMaxInt(pDX, m_nMonth, 1, 12);
	DDX_Text(pDX, IDC_EDIT3, m_nDay);
	DDV_MinMaxInt(pDX, m_nDay, 1, 31);
	DDX_Text(pDX, IDC_EDIT7, m_strTomorrow);
	//}}AFX_DATA_MAP
}

BEGIN_MESSAGE_MAP(CNextDateV3Dlg, CDialog)
	//{{AFX_MSG_MAP(CNextDateV3Dlg)
	ON_WM_SYSCOMMAND()
	ON_WM_PAINT()
	ON_WM_QUERYDRAGICON()
	ON_BN_CLICKED(IDC_BTN_COMPUTE, OnBtnCompute)
	ON_BN_CLICKED(IDC_BTN_CLEAR, OnBtnClear)
	//}}AFX_MSG_MAP
END_MESSAGE_MAP()

/////////////////////////////////////////////////////////////////////////////
// CNextDateV3Dlg message handlers

BOOL CNextDateV3Dlg::OnInitDialog()
{
	CDialog::OnInitDialog();

	// Add "About..." menu item to system menu.

	// IDM_ABOUTBOX must be in the system command range.
	ASSERT((IDM_ABOUTBOX & 0xFFF0) == IDM_ABOUTBOX);
	ASSERT(IDM_ABOUTBOX < 0xF000);

	CMenu* pSysMenu = GetSystemMenu(FALSE);
	if (pSysMenu != NULL)
	{
		CString strAboutMenu;
		strAboutMenu.LoadString(IDS_ABOUTBOX);
		if (!strAboutMenu.IsEmpty())
		{
			pSysMenu->AppendMenu(MF_SEPARATOR);
			pSysMenu->AppendMenu(MF_STRING, IDM_ABOUTBOX, strAboutMenu);
		}
	}

	// Set the icon for this dialog.  The framework does this automatically
	//  when the application's main window is not a dialog
	SetIcon(m_hIcon, TRUE);			// Set big icon
	SetIcon(m_hIcon, FALSE);		// Set small icon
	
	// TODO: Add extra initialization here
	// 保证初始显示的时候无任何输入
	m_ctrlYear.SetWindowText( "" );
	m_ctrlMonth.SetWindowText( "" );
	m_ctrlDay.SetWindowText( "" );
	
	return TRUE;  // return TRUE  unless you set the focus to a control
}

void CNextDateV3Dlg::OnSysCommand(UINT nID, LPARAM lParam)
{
	if ((nID & 0xFFF0) == IDM_ABOUTBOX)
	{
		CAboutDlg dlgAbout;
		dlgAbout.DoModal();
	}
	else
	{
		CDialog::OnSysCommand(nID, lParam);
	}
}

// If you add a minimize button to your dialog, you will need the code below
//  to draw the icon.  For MFC applications using the document/view model,
//  this is automatically done for you by the framework.

void CNextDateV3Dlg::OnPaint() 
{
	if (IsIconic())
	{
		CPaintDC dc(this); // device context for painting

		SendMessage(WM_ICONERASEBKGND, (WPARAM) dc.GetSafeHdc(), 0);

		// Center icon in client rectangle
		int cxIcon = GetSystemMetrics(SM_CXICON);
		int cyIcon = GetSystemMetrics(SM_CYICON);
		CRect rect;
		GetClientRect(&rect);
		int x = (rect.Width() - cxIcon + 1) / 2;
		int y = (rect.Height() - cyIcon + 1) / 2;

		// Draw the icon
		dc.DrawIcon(x, y, m_hIcon);
	}
	else
	{
		CDialog::OnPaint();
	}
}

// The system calls this to obtain the cursor to display while the user drags
//  the minimized window.
HCURSOR CNextDateV3Dlg::OnQueryDragIcon()
{
	return (HCURSOR) m_hIcon;
}


// Judge whether the given year is a leap year
bool isLeapYear( const int& year )
{
	bool isLeap = false;
	if( (year%4==0 && year%100!=0) || year%400==0 )
		isLeap = true;
	return isLeap;
}

////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
//
//         以下是NextDate的第三个例子，是集成版本的
//
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
typedef struct MyDate{
	int month;
	int day;
	int year;
}MyDATE;
int lastDayOfMonth( const int& year, const int& month );
bool GetDate( const int& year, const int& month, const int& day, MyDate& date );
bool ValidDate( const MyDate& date );
MyDate IncrementDate( const MyDate& date );
CString PrintDate( const MyDate& date );

void NextDate3( const int& year, const int& month, const int& day, CString& strTomorrow )
{
	MyDate today, tomorrow;

	if( !GetDate( year, month, day, today ) )// 获取当天的日期，并进行有效性检验
		return;

	tomorrow = IncrementDate( today );
	// 考虑到2012-12-31的next date将超限，因此对计算后的结果仍需再次检验
	if( ValidDate( tomorrow ) )
		strTomorrow = PrintDate( tomorrow );
	else
		strTomorrow = "Reach the last day of the year 2012.\n";
}

// 该函数用于指出指定年份和指定月份的月末日期
int lastDayOfMonth( const int& year, const int& month )
{
	int nLastDayOfMonth;
	if( month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 )
		nLastDayOfMonth = 31;// 若每月有31天，则月末日期为31
	else if( month == 2 )// 若为2月
	{
		if( isLeapYear( year ) )
			nLastDayOfMonth = 29;// 若为闰年，则月末日期为29号
		else
			nLastDayOfMonth = 28;// 若为普通年份，则月末日期为28号
	}
	else
		nLastDayOfMonth = 30;// 若每月有30天，则月末日期为30号
	return nLastDayOfMonth;
}

// 该函数用于获取指定日期，并判断该日期是否有效
bool GetDate( const int& year, const int& month, const int& day, MyDate& aDate )
{
	aDate.year = year;// 将输入传给aDate
	aDate.month = month;
	aDate.day = day;
	if( !ValidDate( aDate ) )// 若是无效日期，则要求重新输入
		return false;
	else
		return true;
}

// 对日期进行有效性校验
bool ValidDate( const MyDate& aDate )
{
	bool bMonthOK = false;
	if( aDate.month>0 && aDate.month<=12 )// 若月份在[1,12]之间，则月份有效
		bMonthOK = true;

	bool bDayOK = false; 
	if( bMonthOK )// 当月份有效时，若日期在1到月末日期之间（含月末日期），则日期有效
	{
		if( aDate.day>0 && aDate.day<=lastDayOfMonth( aDate.year, aDate.month ) ) 
			bDayOK = true;
	}

	bool bYearOK = false;
	if( aDate.year>=1800 && aDate.year<=2050 )// 当年份在[1800,2050]之间时，年份有效
		bYearOK = true;

	bool bValid = false;
	if( bMonthOK && bDayOK && bYearOK )// 年份、月份和日期均有效，则输入有效
		bValid = true;
//	else// 否则给出输入提示
//		AfxMessageBox( "Possible invalid input of MM DD YYYY.\n" );
	return bValid;
}

// 计算后一天的日期
MyDate IncrementDate( const MyDate& date )
{
	MyDate tomorrow;
	tomorrow.month = date.month;// initialization
	tomorrow.day = date.day;
	tomorrow.year = date.year;

	if( date.day<lastDayOfMonth( date.year, date.month ) )
		tomorrow.day = date.day + 1;// 若不是月末日期，则日期加1
	else// 若是月末的日期
	{
		tomorrow.day = 1;
		if( date.month == 12 )
		{// 若是12月，则正好是年末日期，需要将日期和月份复位，年份加1
			tomorrow.month = 1;
			tomorrow.year = date.year + 1;
		}
		else// 若是月末日期，但不是年末日期，则日期需要复位，月份加1
			tomorrow.month = date.month + 1;
	}
	return tomorrow;
}
// 打印日期
CString PrintDate( const MyDate& aDate )
{
	CString str = "";
	str.Format( "Day is:%d-%d-%d\n", aDate.year, aDate.month, aDate.day );
	return str;
}

// 根据今天的日期计算明天的日期并输出计算结果
void CNextDateV3Dlg::OnBtnCompute() 
{
	UpdateData();// 更新数据

	// 计算下一天的日期，并设置输出编辑框
	NextDate3( m_nYear, m_nMonth, m_nDay, m_strTomorrow );
	m_ctrlTomorrow.SetWindowText( m_strTomorrow );	
	
}

// 清除输入框和输出框
void CNextDateV3Dlg::OnBtnClear() 
{
	m_nYear = 0;
	m_nMonth = 0;
	m_nDay = 0;
	m_ctrlYear.SetWindowText( "" );
	m_ctrlMonth.SetWindowText( "" );
	m_ctrlDay.SetWindowText( "" ); 
	m_strTomorrow = "";
	m_ctrlTomorrow.SetWindowText( m_strTomorrow );
	
}
