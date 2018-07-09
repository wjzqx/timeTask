package com.vrv.vo;

/**
 * 客户端菜单配置实体
 * @author wale
 *
 */
public class FontMenu {
    // 主键
    private int id;
    // 路径名称
    private String pathName;
    // 图表
    private String classIcon;
    // 菜单名称(中文)
    private String zhName;
    // 菜单名称(英文)
    private String enName;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPathName() {
        return pathName;
    }
    public void setPathName(String pathName) {
        this.pathName = pathName;
    }
    public String getClassIcon() {
        return classIcon;
    }
    public void setClassIcon(String classIcon) {
        this.classIcon = classIcon;
    }
    public String getZhName() {
        return zhName;
    }
    public void setZhName(String zhName) {
        this.zhName = zhName;
    }
    public String getEnName() {
        return enName;
    }
    public void setEnName(String enName) {
        this.enName = enName;
    }
    @Override
    public String toString() {
        return "FontMenu [id=" + id + ", pathName=" + pathName + ", classIcon=" + classIcon + ", zhName=" + zhName + ", enName=" + enName + "]";
    }
    
    
    

}
