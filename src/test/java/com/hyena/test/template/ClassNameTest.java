package com.hyena.test.template;


import org.junit.Test;

/**
 *
 *
 * 测试目标：<测试类主要功能说明>
 *
 * 备注：
 *      1.单测类名称：测试的类名+Test
 *
 * @author yangxingdong
 */
public class ClassNameTest {


    //     ----------------------------- methodName unite --------------------------//

    /**
     * 需求：XXX
     * 测试目标：<写这个类主要测试的业务方法功能>
     * 测试数据：            // 以键值对方式写本测试用例中需要的数据，如果没有写无
     *     name  hyena
     *     age   12
     *     location beijing/china
     *
     * 测试结果：
     *          negative/positive      // 失败/成功，状态
     *          说明                   // 测试结果说明
     *          数据：xx               // 测试数据
     *
     *
     *
     * 注意：                  //运行本次单测需要注意的地方，例如
     *      1.修改配置文件，将x.properties中config修改为y
     *      2.在测试过程中出现了BUG，原因XXX
     *
     *
     * 备注：
     *      1.主要是希望通过单测上面的注释能够复现/让别人了解这个单测在运行时候的状态和结果.
     *      2.单测数据不应该影响数据库中的数据，使数据库中数据依赖不完整
     *      3.一个测试类中只测待测试的业务类/controller中的方法。如果要测试其它类中的方法，考虑是否可以归到某个测试类/创建
     *      新的测试类
     *      4.单测方法名称methodNameTestNum
     *          其中methodName是要进行单测的方法
     *          Test是在methodName加的一个后缀，方便全局搜索
     *          Num是针对同一要测试的方法，但是需要多个测试用例来测试代码分支的情况或者要测试的方法在不通的需求中被用到
     *     例如：待测试方法名称 service，则对应的单测名称为：
     *              serviceTest1
     *              serviceTest2
     *              serviceTest3
     *
     *      5.同一个方法的多个测试用例都写在一个测试族里面，即被注释 //----- methodName unite -----//  上下扩起来的
     *
     *      6.在实际的单测注释中只需写: 测试目标，测试数据，测试结果，注意  即可！
     *
     *      7.为了防止测试族里面的方法不断增多，也就是对于同一个业务方法由于别人不知道存在单测的情况下，又写了额外的单测。
     *        在写新的单测时应该全局搜索是否已相应的测试族
     *        例如：UserServiceImpl.updateUser
     *
     *      8**.对于数据库操作（增删改查）
     *          查询  不需使用@Rollback注解
     *          删除/增加/修改操作   使用@Rollback注解
     *          原则：凡事影响数据库数据之间的关系时（如果没有100%的把握），可以使用@Rollback注解回滚事务以免对原来的
     *              数据依赖关系造成破坏
     *
     *
     * @author yangxingdong
     */
    @Test
    public void methodNameTestNum() {
    }


    /**
     * 测试目标：
     * 测试数据：
     * 测试结果：
     * 注意：
     * @author xxx
     */
    @Test
    public void methodNameTestNum1() {

    }

    //------------------------------- methodName unite end--------------------//


    //------------------------- updateUser unite --------------------//

    /**
     * 测试目标：使用userName更新对应用户id的名称
     *
     * 测试数据：
     *      userName   jack
     *      id     12434
     * 测试结果：positive
     *
     *
     */
    @Test
    public  void updateUserTest1() {

    }
    //------------------------- updateUser unite end--------------------//

}
