package cn.dsx.codegenerator.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class EmpDaily {
    private Integer empDailyId;

    /**
     * 员工id
     * 2020-03-04
     */
    private Integer empId;

    /**
     * 日报填报日期
     * 2020-03-04
     */
    private Date createtime;

    /**
     * 日报日期 默认当天 也可以选择前天等 但是不能选择明天
     * 2020-03-04
     */
    private String dailytime;

    /**
     * 分数 ，审核人打分
     * 2020-03-04
     */
    private BigDecimal dailyscores;

    /**
     * 审核时间
     * 2020-03-04
     */
    private Date audittime;

    /**
     * 审核人
     * 2020-03-04
     */
    private Integer audithrid;

    /**
     * 日报内容
     * 2020-03-04
     */
    private String dailycontent;

    /**
     * 日报状态  1已审阅  2 未审阅
     * 2020-03-04
     */
    private Integer flag;

    public Integer getEmpDailyId() {
        return empDailyId;
    }

    public void setEmpDailyId(Integer empDailyId) {
        this.empDailyId = empDailyId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDailytime() {
        return dailytime;
    }

    public void setDailytime(String dailytime) {
        this.dailytime = dailytime;
    }

    public BigDecimal getDailyscores() {
        return dailyscores;
    }

    public void setDailyscores(BigDecimal dailyscores) {
        this.dailyscores = dailyscores;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Integer getAudithrid() {
        return audithrid;
    }

    public void setAudithrid(Integer audithrid) {
        this.audithrid = audithrid;
    }

    public String getDailycontent() {
        return dailycontent;
    }

    public void setDailycontent(String dailycontent) {
        this.dailycontent = dailycontent;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}