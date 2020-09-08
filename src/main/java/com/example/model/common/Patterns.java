package com.example.model.common;

/**
 * <p>
 * <b>Class name</b>: Patterns
 * </p>
 * <p>
 * <b>Class description</b>: Class description goes here.
 * </p>
 * <p>
 * <b>Author</b>: zhang ying
 * </p>
 * <b>Change History</b>:<br/>
 * <p>
 *
 * <pre>
 * Date          Author       Revision     Comments
 * ----------    ----------   --------     ------------------
 * 2019-04-24    zhang ying        1.0          Initial Creation
 *
 * </pre>
 *
 * @author zhang ying
 * @date 2019-04-24
 * </p>
 */
public final class Patterns {

    private Patterns(){}

    public static final String REG_MOBILE_PHONE = "^(1\\d{10})$";

    /** YYYYMMDD 日期check */
    public static final String REG_DATE_FORMAT_SIX_DIG="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})(((0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))" +
            "|((0[469]|11)(0[1-9]|[12][0-9]|30))|(02(0[1-9]|[1][0-9]|2[0-8]))))" +
            "|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))0229)";
    /** YYYY-MM-DD 日期check */
    public static final String REG_DATE_VALIDITY = "^(?:(?!0000)[0-9]{4}-(?:(?:0[1-9]|1[0-2])-(?:0[1-9]|1[0-9]|2[0-8])|(?:0[13-9]|1[0-2])-(?:29|30)|(?:0[13578]|1[02])-31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)-02-29)$";
    public static final String REG_DATE_YYYY_MM_DD="^((?:19|20)\\d\\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
    public static final String REG_DATE_YYYY_MM_DD_BLANK_ABLE="^$|^((?:19|20)\\d\\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
    public static final String REG_DATE_YYYY_MM_DD_HH24_MI_SS="^((?:19|20)\\d\\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]) (0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    public static final String REG_DATE_YYYY_MM_DD_HH24_MI_SS_BLANK_ABLE="$|^((?:19|20)\\d\\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]) (0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";
    public static final String REG_DATE_HH24_MI_SS = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";

    /** HH:MM:SS 时间check */
    public static final String REG_TIME_HH24_MI_SS = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$";

    /**
     * HH:MM 时间check
     */
    public static final String REG_TIME_HH24_MI = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";

    /**设备iccidNumber*/
    public static final String REG_DEVICE_ICCIDNUMBER = "^([A-Za-z0-9]){20}$";
    /**设备imeiNumber*/
    public static final String REG_DEVICE_IMEINUMBER = "^([0-9]){15}$";
    /**IMSI*/
    public static final String REG_DEVICE_IMSINUMBER = "^([A-Za-z0-9]){15}$";

    /**SIM卡 pin*/
    public static final String REG_SIM_PIN = "^([0-9]){8}$";

    /**SIM卡 puk*/
    public static final String REG_SIM_PUK = "^([0-9]){8}$";

    /** 车牌号*/
    public static final String REG_VEHICLE_NUMBER="^([京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼]{1}(([A-HJ-Z]{1}[A-HJ-NP-Z0-9]{5})|([A-HJ-Z]{1}(([DF]{1}[A-HJ-NP-Z0-9]{1}[0-9]{4})|([0-9]{5}[DF]{1})))|([A-HJ-Z]{1}[A-D0-9]{1}[0-9]{3}警)))|([0-9]{6}使)|((([沪粤川云桂鄂陕蒙藏黑辽渝]{1}A)|鲁B|闽D|蒙E|蒙H)[0-9]{4}领)|(WJ[京津沪渝冀豫云辽黑湘皖鲁新苏浙赣鄂桂甘晋蒙陕吉闽贵粤青藏川宁琼·•]{1}[0-9]{4}[TDSHBXJ0-9]{1})|([VKHBSLJNGCE]{1}[A-DJ-PR-TVY]{1}[0-9]{5})$";

    /**手机号 */
    public static final String REG_PHONE = "^[1]\\d{10}$";

    public static final String REG_NUMBER_NINE_DECIMAL="^[0-9]{1,3}+(.[0-9]{1,9})$";

    /** 保单号*/
    public static final String REG_POLICY_NUMBER="^[a-zA-Z0-9]{1,50}$";

    public static final String REG_ONLY_CHARACTER="^[a-zA-Z]{1,50}$";

    /** 小数点后可有2位*/
    public static final String REG_DIGITAL_TWO_DECIMA="^[0-9]+(.[0-9]{1,2})?$";

    /** 用户名 **/
    public static final String REG_USER_NAME = "^[a-zA-Z0-9_]{4,20}$";

    /**用户姓名:只能输入汉字、字母和数字**/
    public static final String REG_USER_REAL_NAME= "^[a-z0-9A-Z\u4e00-\u9fa5]+$";

    public static final String REG_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)|(^\\d{17}(\\d|X|x)$)";

    public static final String REG_POSITION_CODE = "^[a-zA-Z0-9]{1,30}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REG_EMAIL = "^([a-z0-9A-Z]+[-|\\.|_]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /** 密码 至少8位数，包含大写字母+小写字母+数字+符号(~!@#$%^&*?)**/
    public static final String REG_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[~!@#$%^&*()_+{}|:\"<>?`\\-=\\[\\]\\\\;',./])[A-Za-z\\d~!@#$%^&*()_+{}|:\"<>?`\\-=\\[\\]\\\\;',./]{8,20}$";

    public static final String REG_VEHICLE_IDENTIFICATION="^[A-Z0-9]{17}$";

    public static final String REG_VEHICLE_OUTPUT="^$|^(([1-9]\\d*.\\d+)|(0\\.\\d*[1-9]\\d*))(L|T)$";

    /** 部标设备的设备编码 */
    public static final String REG_DEVICE_NUMBER= "^([A-Za-z0-9]){12}$";

    /**
     * 后视镜WiFi网络名称的有效字符包含：0-9 a-z A-Z ! #. %@ _ 和空格且开头和结尾不能是空格
     */
    public static final String REG_CMCCOS_WIFI_SSID = "^([A-Za-z0-9\\!#\\.%@_]{1,2})$|^([A-Za-z0-9\\!#\\.%@_])([A-Za-z0-9\\!#\\.%@_\\s])*([A-Za-z0-9\\!#\\.%@_])$";

    /**
     * 后视镜WiFi密码的有效字符包含：0-9 a-z A-Z ! #. %@ _
     */
    public static final String REG_CMCCOS_WIFI_PASSWD = "^[A-Za-z0-9\\!#\\.%@_]*$";

    /**
     * 上行短信有效内容:1或2开头后面跟逗号或句号
     */
    public static final String REG_VALID_UPSTREAM_CONTENT = "^[1-2][,|.|，|。]?\\s?";

    /**
     * 上行短信审批通过:1开头后面跟逗号或句号
     */
    public static final String REG_VALID_UPSTREAM_CONTENT_PASS = "^[1][,|.|，|。]?\\s?";

    /**
     * 上行短信审批拒绝:2开头后面跟逗号或句号
     */
    public static final String REG_VALID_UPSTREAM_CONTENT_REFUSE = "^[2][,|.|，|。]?\\s?";

    public static  final String REG_ORGANIZATION_IMPORT_PATH = "^./.*？";
}
