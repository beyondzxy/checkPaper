# 3118005314
软工个人编程作业——论文查重

## dev_03

完善测试类，测试类有开发过程中的测试类，以及最终的测试类。

完成主程序需求，能够输入路径，并指定答案输出路径

完成主程序测试，与预期结果相符

## dev_02

通过查询资料，决定在短文的比对上使用余弦相似度算法来进行比对。结果简单测试在短文本上确实有着明显改变。因此对程序进行优化，判断长度小于3000的的文本使用simhash算法进行对比，而超过3000的则使用预先相似度算法

增加了自定义异常类，由于比较空文本是无意义的，因此将这一情况当作程序预期之外的异常进行处理，抛出空文本异常


## dev_01

分析需求，查询算法后发现可以使用simhash算法进行实现

用`simhash`算法初步完成了demo

给出的示例文本的查重效果已能够基本符合预期。

存在问题：在开发测试（DevTest）过程的中发现对于短文本的查重精度会有较大偏差。

解决构思：引入新的短文本最优算法，判断字数，择优而行。
