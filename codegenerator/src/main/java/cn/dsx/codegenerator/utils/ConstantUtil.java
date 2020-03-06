package cn.dsx.codegenerator.utils;

/**
 * @Classname: ConstantUtil
 * @Author: Dsx
 * @Date: 2020/1/5 0005
 */
public final class ConstantUtil {


    /**
     * 默认密码
     */
    public final static String DEFAULT_PASS = "123456";


    /**
     * 快速生成controller和service相关工具
     */
    public static final String BASE_PACKAGE = "cn.dsx.codegenerator";//生成代码所在的基础包名称，可根据自己公司的项目修改（注意：这个配置修改之后需要手工修改src目录项目默认的包路径，使其保持一致，不然会找不到类）

    public static final String BASE_PACKAGE_FRAME = "cn.dsx.codegenerator";//框架所在的基础包

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".pojo";//生成的Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";//生成的Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//生成的Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//生成的ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".rest";//生成的Controller所在包
    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE_FRAME + ".utils.code.Mapper";//Mapper插件基础接口的完全限定名



}
