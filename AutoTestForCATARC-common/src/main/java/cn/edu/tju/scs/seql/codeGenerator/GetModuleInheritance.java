package cn.edu.tju.scs.seql.codeGenerator;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetModuleInheritance {

    String[] moduleStr = { "数据管理(#784)", "数据管理(#784)->基础数据同步(#790)", "数据管理(#784)->MDS数据同步(#791)",
            "数据管理(#784)->材料数据创建(#792)", "数据管理(#784)->材料数据管理(#793)", "数据管理(#784)->审核信息(#794)", "车型管理(#785)",
            "车型管理(#785)->车型信息(#795)", "车型管理(#785)->车型BOM管理(#796)", "车型管理(#785)->BOM分发结果(#797)",
            "车型管理(#785)->零部件BOM(#798)", "车型管理(#785)->变更零部件(#799)", "车型管理(#785)->扩展零部件(#800)", "综合分析(#786)",
            "综合分析(#786)->有害物质分析(#801)", "综合分析(#786)->报告管理(#802)", "综合分析(#786)->进展报表管理(#803)",
            "综合分析(#786)->零部件RRR计算(#804)", "综合分析(#786)->整车RRR计算(#805)", "综合分析(#786)->禁限用物质豁免分析(#806)", "消息管理(#787)",
            "消息管理(#787)->新建消息(#807)", "消息管理(#787)->消息查询(#808)", "消息管理(#787)->新建请求(#809)", "消息管理(#787)->查询请求(#810)",
            "法规信息(#788)", "法规信息(#788)->标准信息(#811)", "法规信息(#788)->公告信息(#812)", "法规信息(#788)->最新法规(#813)",
            "法规信息(#788)->行业动态(#814)", "法规信息(#788)->高危清单(#815)", "系统管理(#789)", "系统管理(#789)->部门信息(#816)",
            "系统管理(#789)->用户信息(#817)", "系统管理(#789)->个人信息(#818)", "系统管理(#789)->日志信息(#819)", "系统管理(#789)->供应商管理(#820)",
            "系统管理(#789)->角色信息(#821)", "数据管理(#325)", "数据管理(#325)->基础数据同步(#331)", "数据管理(#325)->MDS数据同步(#332)",
            "数据管理(#325)->材料数据管理(#333)", "数据管理(#325)->审核信息(#334)", "数据管理(#325)->材料数据创建(#335)", "车型管理(#326)",
            "车型管理(#326)->车型信息(#336)", "车型管理(#326)->车型BOM信息(#337)", "车型管理(#326)->BOM分发结果(#338)",
            "车型管理(#326)->零部件BOM信息(#339)", "车型管理(#326)->变更零部件(#340)", "车型管理(#326)->扩展零部件(#341)", "综合分析(#327)",
            "综合分析(#327)->有害物质分析(#342)", "综合分析(#327)->报告管理(#343)", "综合分析(#327)->进展报表统计(#344)",
            "综合分析(#327)->零部件RRR计算(#345)", "综合分析(#327)->整车RRR计算(#346)", "综合分析(#327)->禁限用物质豁免分析(#347)", "消息管理(#328)",
            "消息管理(#328)->新建消息(#348)", "消息管理(#328)->信息查询(#349)", "消息管理(#328)->创建请求(#350)", "消息管理(#328)->查询请求(#351)",
            "法规管理(#329)", "法规管理(#329)->标准信息(#352)", "法规管理(#329)->公告信息(#353)", "法规管理(#329)->最新法规(#354)",
            "法规管理(#329)->行业动态(#355)", "法规管理(#329)->高危清单(#356)", "系统管理(#330)", "系统管理(#330)->部门信息(#357)",
            "系统管理(#330)->用户信息(#358)", "系统管理(#330)->个人信息(#359)", "系统管理(#330)->日志信息(#360)", "系统管理(#330)->供应商信息(#361)",
            "系统管理(#330)->角色信息(#362)",
            // 下面是LIMS的模块
            "待办事物管理-old(#552)", "待办事物管理-old(#552)->任务下达(#616)", "待办事物管理-old(#552)->任务草稿(#617)",
            "待办事物管理-old(#552)->待分配的任务(#618)", "待办事物管理-old(#552)->待编辑报告(#619)", "待办事物管理-old(#552)->待修改报告(#620)",
            "待办事物管理-old(#552)->初次校对(#621)", "待办事物管理-old(#552)->检验报告(#622)", "待办事物管理-old(#552)->审核报告(#623)",
            "待办事物管理-old(#552)->批准报告(#624)", "待办事物管理-old(#552)->任务管理(#625)", "待办事物管理-old(#552)->修改单(#626)",
            "待办事物管理-old(#552)->试验员费用确认(#627)", "待办事物管理-old(#552)->单报告管理(#628)", "待办事物管理-old(#552)->我的报告(#629)",
            "待办事物管理-old(#552)->我的报告正在处理(#783)", "中机系统-old(#553)", "中机系统-old(#553)->中机系统公告查询(#610)",
            "中机系统-old(#553)->中机系统公告历史查询(#611)", "中机系统-old(#553)->统计表绑定(#612)", "中机系统-old(#553)->统计表上传(#613)",
            "中机系统-old(#553)->中机标准变化查询(#614)", "中机系统-old(#553)->单报告上传(#615)", "财务管理-old(#554)",
            "财务管理-old(#554)->试验费用确认(#598)", "财务管理-old(#554)->科目确认(#599)", "财务管理-old(#554)->科目类型确认(#600)",
            "财务管理-old(#554)->科室费用确认(#601)", "财务管理-old(#554)->费用确认列表(#602)", "财务管理-old(#554)->催款单查看(#603)",
            "财务管理-old(#554)->对账报表(#604)", "财务管理-old(#554)->发票新增(#605)", "财务管理-old(#554)->发票管理(#606)",
            "财务管理-old(#554)->基本信息导出(#607)", "财务管理-old(#554)->重汽催款单(#608)", "财务管理-old(#554)->任务统计查询(#609)",
            "财务管理-old(#554)->报告统计查询(#695)", "财务管理-old(#554)->临时财务导出(#696)", "财务管理-old(#554)->财务标记(#697)",
            "档案管理-old(#555)", "档案管理-old(#555)->报告归档(#593)", "档案管理-old(#555)->发送下载(#594)", "档案管理-old(#555)->封面(#595)",
            "档案管理-old(#555)->报告目录管理(#596)", "档案管理-old(#555)->登记表(#597)", "样品管理-old(#556)",
            "样品管理-old(#556)->零部件-库房(#560)", "样品管理-old(#556)->整车停车场管理(#561)", "样品管理-old(#556)->人员条形码管理(#562)",
            "样品管理-old(#556)->整车管理(#563)", "样品管理-old(#556)->整车退样管理(#564)", "样品管理-old(#556)->零部件管理(#565)",
            "样品管理-old(#556)->零部件退样管理(#566)", "样品管理-old(#556)->保证金管理(#567)", "样品管理-old(#556)->整车条形码管理(#568)",
            "样品管理-old(#556)->零部件流转(#569)", "仪器设备管理-old(#557)", "仪器设备管理-old(#557)->使用单位管理(#570)",
            "仪器设备管理-old(#557)->检定单位管理(#571)", "仪器设备管理-old(#557)->检定方式管理(#572)", "仪器设备管理-old(#557)->检定项目管理(#573)",
            "仪器设备管理-old(#557)->证书类别管理(#574)", "仪器设备管理-old(#557)->档案状态管理(#575)", "仪器设备管理-old(#557)->设备状态管理(#576)",
            "仪器设备管理-old(#557)->仪器设备管理(#577)", "仪器设备管理-old(#557)->待检仪器设备管理(#578)", "仪器设备管理-old(#557)->在检仪器管理(#579)",
            "仪器设备管理-old(#557)->档案借阅(#580)", "仪器设备管理-old(#557)->仪器号段管理(#581)", "系统设定-old(#558)",
            "系统设定-old(#558)->检验标准库(#582)", "系统设定-old(#558)->检验项目设定(#583)", "系统设定-old(#558)->号段管理(#584)",
            "系统设定-old(#558)->检验车辆类型管理(#585)", "系统设定-old(#558)->公章图片管理(#586)", "系统设定-old(#558)->公章类型(#587)",
            "系统设定-old(#558)->企业信息名录(#588)", "系统设定-old(#558)->删除日志(#589)", "人员和权限-old(#559)",
            "人员和权限-old(#559)->人员管理(#590)", "人员和权限-old(#559)->角色管理(#591)", "人员和权限-old(#559)->部门管理(#592)", "报告工作(#2202)",
            "报告工作(#2202)->任务下达(#2213)", "报告工作(#2202)->任务草稿(#2214)", "报告工作(#2202)->统计表下载(#2215)",
            "报告工作(#2202)->分配检测(#2216)", "报告工作(#2202)->二次分配检测(#2217)", "报告工作(#2202)->检测报告(#2218)",
            "报告工作(#2202)->小批量-无证,票发票【功能未使用】(#2219)", "报告工作(#2202)->我的报告(#2220)", "报告工作(#2202)->我的原始记录(#2221)",
            "报告工作(#2202)->我的报告正在处理(#2222)", "报告工作(#2202)->初次校对(#2223)", "报告工作(#2202)->校验报告(#2224)",
            "报告工作(#2202)->审核报告(#2225)", "报告工作(#2202)->批准报告(#2226)", "报告工作(#2202)->任务管理(#2227)",
            "报告工作(#2202)->归档60(#2228)", "报告工作(#2202)->CQC(#2229)", "报告工作(#2202)->修改单(#2230)",
            "报告工作(#2202)->报告任务统计(#2231)", "报告工作(#2202)->VIN统计(#2232)", "财务管理(#2203)", "财务管理(#2203)->发票管理(#2233)",
            "财务管理(#2203)->发票录入(#2234)", "财务管理(#2203)->财务标记(#2235)", "财务管理(#2203)->实验费用确认(#2236)",
            "财务管理(#2203)->科目类型确认(#2237)", "财务管理(#2203)->科目确认(#2238)", "财务管理(#2203)->科室费用确认(#2260)",
            "财务管理(#2203)->费用确认列表(#2261)", "财务管理(#2203)->催款单(#2262)", "财务管理(#2203)->科室财务报表(#2263)",
            "财务管理(#2203)->对账报表(#2264)", "财务管理(#2203)->天津财务报表(#2265)", "公共事物(#2204)", "公共事物(#2204)->我的文件(#2266)",
            "公共事物(#2204)->汽车标准信息管理【不用】(#2267)", "公共事物(#2204)->删除日志(#2268)", "公共事物(#2204)->包裹单管理(#2269)",
            "公共事物(#2204)->公共文件下载(#2270)", "公共事物(#2204)->Excel统计导出(#2271)", "公共事物(#2204)->统计查询(#2272)",
            "公共事物(#2204)->出帐费用查询(#2273)", "公共事物(#2204)->检验费用(#2274)", "公共事物(#2204)->基本信息导出(#2275)",
            "公共事物(#2204)->EMS(#2276)", "公共事物(#2204)->信使管理(#2277)", "公共事物(#2204)->权限包管理(#2278)",
            "公共事物(#2204)->临时财务导出(#2279)", "公共事物(#2204)->发送方式管理(#2652)", "系统管理-系统设定(#2205)",
            "系统管理-系统设定(#2205)->部门注册(#2280)", "系统管理-系统设定(#2205)->部门查询(#2281)", "系统管理-系统设定(#2205)->用户注册(#2282)",
            "系统管理-系统设定(#2205)->用户查询(#2283)", "系统管理-系统设定(#2205)->检验标准库(#2284)", "系统管理-系统设定(#2205)->检验、修改单类别(#2285)",
            "系统管理-系统设定(#2205)->公章图片(#2286)", "系统管理-系统设定(#2205)->公章类型(#2287)", "系统管理-系统设定(#2205)->检验、车辆类型管理(#2288)",
            "系统管理-系统设定(#2205)->检测项目设定(#2289)", "系统管理-系统设定(#2205)->强检名称设定【作废】(#2290)", "系统管理-系统设定(#2205)->强检名称更正(#2291)",
            "系统管理-系统设定(#2205)->号段管理(#2292)", "企业名录(#2208)", "企业名录(#2208)->企业名录(#2293)", "报告归档(#2209)",
            "报告归档(#2209)->报告归档(#2294)", "报告归档(#2209)->归档抽取(#2295)", "报告归档(#2209)->发送下载(#2296)",
            "报告归档(#2209)->封面(#2297)", "报告归档(#2209)->报告目录管理(#2298)", "报告归档(#2209)->登记表(#2299)", "中机系统(#2210)",
            "中机系统(#2210)->新产品公告(#2300)", "中机系统(#2210)->新产品公告历史(#2301)", "中机系统(#2210)->统计表(#2302)",
            "中机系统(#2210)->离线2.0加载(#2303)" };

    private List<ModulePojo> result;

    /**
     * 根据模块名字在列表中查找对应的类
     *
     * @param moduleName
     * @return
     */
    public ModulePojo findModule(String moduleName) {
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i).getModuleName().equals(moduleName)) {
                return result.get(i);
            }
        }
        return null;
    }

    public GetModuleInheritance() {
        super();
        result = new LinkedList<ModulePojo>();
        for (int i = 0; i < moduleStr.length; i++) {
            String[] str = moduleStr[i].split("->");
            if (str.length == 1) {
                Pattern pattern = Pattern.compile("(?<=\\#).*(?=\\))");
                Matcher matcher = pattern.matcher(str[0]);
                if (matcher.find()) {
                    String id = matcher.group();
                    ModulePojo module = new ModulePojo(id, str[0]);
                    result.add(module);
                }
            } else {
                Pattern pattern = Pattern.compile("(?<=\\#).*(?=\\))");
                Matcher matcher = pattern.matcher(str[str.length - 1]);
                if (matcher.find()) {
                    String id = matcher.group();
                    ModulePojo module = new ModulePojo(id, str[str.length - 1]);
                    ModulePojo parent = findModule(str[str.length - 2]);
                    module.setParentModule(parent);
                    parent.getSubModules().add(module);
                    result.add(module);
                }
            }
        }
    }

    public List<ModulePojo> getModuleInheritance() {
        return result;
    }

    public static void main(String[] args) {
        GetModuleInheritance main = new GetModuleInheritance();
        main.getModuleInheritance();
    }

}
