package com.sixunhuan.nh.lanban.nh.core.constants;

/**
 * ClassName: SysConstants <br/>
 * Description: TODO <br/>
 * Date: 2016年6月23日 上午10:48:32 <br/>
 * <br/>
 * 
 * @author maximus(邮箱)
 * 
 *         修改记录
 * @version V1.0.0 2016年6月23日 maximus Initial version<br/>
 * 
 */
public class SysConstants {

    /**
     * JCF_MSG_PROPERTY_DYNAMIC_SERVICE:JCF流程重定义属性值.
     * 
     */
    public static final String JCF_MSG_PROPERTY_DYNAMIC_SERVICE = "JCF_TARGET";

    /**
     * DEP_UNKNOW_SERVICE:处理指令无法识别的服务名.
     * 
     */
    public static final String DEP_UNKNOW_SERVICE = "unknow";
    /**
     * 
     */
    public static final String OBJECT_PAXLST_UNEDIINTERCHANGE = "OBJECT_PAXLST_UNEDIINTERCHANGE";
    /**
     * 
     */
    public static final String OBJECT_PAXLST_UNEDIMESSAGE = "OBJECT_PAXLST_UNEDIMESSAGE";
    /**
     * OBJECT_PAXLST:
     * 
     */
    public static final String OBJECT_PAXLST = "object_paxlst";
    public static final String OBJECT_FLIGHT_VO = "OBJECT_FLIGHT_VO";
    public static final String OBJECT_PSG_LIST = "OBJECT_PSG_LIST";
    /**
     * OBJECT_CUSRES:
     * 
     */
    public static final String OBJECT_CUSRES = "object_cusres";

    public static final String OBJECT_REQUEST_VO = "OBJECT_REQUEST_VO";
    public static final String OBJECT_RESPONSE_VO = "OBJECT_RESPONSE_VO";
    public static final String OBJECT_COMBINED_VO = "OBJECT_COMBINED_VO";
    public static final String OBJECT_EDI_VO_LIST = "OBJECT_EDI_VO_LIST";
    public static final String OBJECT_SYS_VO = "OBJECT_SYS_VO";

    public static final String YES = "YES";
    public static final String NO = "NO";

    public static final String CLOSE_ALL_TIMES_RECEIVED = "CLOSE_ALL_TIMES_RECEIVED";
    public static final String CLOSE_DATA_VO = "CLOSE_DATA_VO";
    public static final String CANCEL_DATA_VO = "CANCEL_DATA_VO";
    public static final String CUSRES_DATA_VO = "CUSRES_DATA_VO";
    public static final String CLOSE = "CLOSE";
    public static final String CLOSE_LOCK_KEY = "CLOSE_LOCK_KEY";
    public static final String CLOSE_LOCK_VALUE = "closeLockValue";
    public static final String CANCEL = "CANCEL";
    public static final String CANC = "CANC";

    public static final String LOG_FLIGHT_INFO = "LOG_FLIGHT_INFO";
    /**
     * MSG_PAXLST:
     * 
     */
    public static final String MSG_PAXLST = "msg_paxlst";
    public static final String ERROR_MSG_CODE = "errorMsgCode";
    public static final String MSG_BGM_CODE = "MSG_BGM_CODE";
    public static final String PAXLST_SEGMENT_COUNT = "PAXLST_SEGMENT_COUNT";
    public static final String MSG_INPUT_JSON = "MSG_INPUT_JSON";

    /**
     * MSG_RULE:
     * 
     */
    public static final String MSG_RULE = "msg_rule";
    public static final String MSG_UNS = "msg_uns";
    /**
     * MSG_CUSRES:
     * 
     */
    public static final String MSG_CUSRES = "msg_cusres";
    public static final String MSG_CO = "msg_co";

    public static final String INTERCHANGE41 = "interchange41";
    public static final String MESSAGE41 = "message41";
    public static final String CUSRES = "cusres";

    /**
     * 
     */
    public static final int DEFAULT_ERROR_CODE = 900100;

    public static final char LETTER_A = 'A';

    public static final char LETTER_Z = 'Z';

    public static final char NUMBERIC_0 = '0';
    public static final char NUMBERIC_1 = '1';

    /**
     * 表示UTF-8字符集名
     */
    public static final String UTF8 = "UTF-8";
    /**
     * 表示GBK字符集名
     */
    public static final String GBK = "GBK";
    /**
     * 表示GB18030字符集名
     */
    public static final String GB18030 = "GB18030";
    /**
     * 表示ISO8859-1字符集名
     */
    public static final String ISO8859 = "ISO8859-1";
    /**
     * 表示US-ASCII字符集名
     */
    public static final String ASCII = "US-ASCII";
    /**
     * 
     */
    public static final String TX_BEGIN = "TX_BEGIN";
    public static final String TX_END = "TX_END";

    public static final String ONE_SPACE = " ";
    public static final String COLONS = ":";
    public static final String COMMA = ",";
    public static final String SINGLE_QUATO = "'";
    public static final String BLANK = "";
    public static final String SLASH = "/";

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String DECIMAL_POINT = ".";
    public static final String QUESTION_MARK = "?";

    public static final String SPLIT_QUATO = "\\'";
    public static final String SPLIT_PLUS = "\\+";
    public static final String SPLIT_COLONS = "\\:";

    public static final String LEFT_BRACKET = "[";
    public static final String RIGHT_BRACKET = "]";
    public static final String LEFT_BRACE = "{";
    public static final String RIGHT_BRACE = "}";

    public static final String DOUBLE_QUOTE = "\"";

    public static final String NAMESPACE = "http://www.travelsky.com/srvMsg";

    /**
     * EXCEPTION_CATCH_KEY:try catch或其他需要抓异常的组件，需要在exchange属性里的异常key值.
     * 
     */
    public static final String EXCEPTION_CATCH_KEY = "CamelExceptionCaught";
    /**
     * 异常信息没有ERROR MESSAGE
     */
    public static final String ERR_MSG_IS_NULL = "null";
    /**
     * ORA_PREFIX:数据库异常标志：ORA-.
     * 
     */
    public static final String ORA_PREFIX = "ORA-";

    public static final String SIH_ORISYS = "SIH_OriSys";

    public static final String CMD_RM = "RM";
    public static final String CMD_SEC = "SEC";
    public static final String CN = "CN";

    public static final String TIME_FORMAT_YYMMDD = "yyMMdd";
    public static final String TIME_FORMAT_YYMMDDHHMM = "yyMMddHHmm";
    public static final String TIME_FORMAT_ISO = "yyyy-MM-dd";
    public static final String TIME_FORMAT_MMDDHHMMSSSSS = "MMddHHmmssSSS";
    public static final String TIME_FORMAT_YYYYMMDDHHMMSSSSS = "yyyyMMddHHmmssSSS";
    public static final String TIME_FORMAT_MMDD = "MMdd";
    public static final String TIME_FORMAT_HHMMSSSSS = "HHmmssSSS";
    public static final String TIME_FORMAT_HHMM = "HHmm";
    public static final String TIME_FORMAT_YYMMDD_HHMM = "yyMMdd:HHmm";
    public static final String TIME_FORMAT_DDMMMYY = "ddMMMyy";
    public static final String TIME_FORMAT_MMMDD = "MMMdd";
    public static final String TIME_FORMAT_DDMMMYY_HH_MM_SS = "ddMMMyy HH:mm:ss";
    public static final String TIME_FORMAT_YYYYMMDD = "yyyyMMdd";
    /**
     * CARRIAGE_RETURN:
     * 
     */
    public final static String CARRIAGE_RETURN = "\r";
    /**
     * NEW_LINE:
     * 
     */
    public final static String NEW_LINE = "\n";
    /**
     * CARRIAGE_RETURN_NEW_LINE:
     * 
     */
    public final static String CARRIAGE_RETURN_NEW_LINE = "\r\n";

    public final static String AGGREGATION_SPLITTER = "=======";

    public static final String SYSTEM_DEFAULT_ERROR_CODE = "FUNCTION";

    /**
     * DEFAULT_TIMEZONE: 系统默认时区
     */
    public final static String DEFAULT_TIMEZONE = "GMT+8:00";

    public final static String STRING_NULL = "NULL";

    public final static String STRING_LOW_NULL = "null";

    public final static String STRING_Y = "Y";
    public final static String STRING_N = "N";
    public final static String STRING_F = "F";

    public final static String CLOS = "CLOS";

    public final static String OLD_MSG = "OLD_MSG";

    public static final String DATE_FORMAT_ddMMMyy = "ddMMMyy";

    /**
     * SECRET_KEY: 加解密密钥
     */
    public final static String SECRET_KEY = "secretKey";
    
    /**
     * 
     */
    public final static String ENCRYPT_LOAD_PROPERTIES_FAIL = "ENCRYPT_LOAD_PROPERTIES_FAIL";
    public final static String ENCRYPT_PROPERTIES_NOT_EXIST = "ENCRYPT_PROPERTIES_NOT_EXIST";
    
    public final static String EXCHANGE_ORIGINAL_CWA = "ORIGINAL_CWA";

}
