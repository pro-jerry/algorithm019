##### 学习笔记

第一题:用 add first 或 add last 这套新的 API 改写 Deque 的代码

在Java中Deque 为一个接口，不明白add first 或 add last 这套新的 API是什么意思，确切的说不明题意

第二题:分析 Queue 和 Priority Queue 的源码
Queue 作为一个接口包含了add(E e)，offer(E e) 插入操作，element() 检索但是但不删除此队列的头。remove() poll() 检索和删除队列的头 peek()检索队列的头。

PriorityQueue 是由数组Object[] queue构成 向里面添加一个数offer(E e),容量加1grow(i + 1)，如果队列为null,queue[0] = e，
队列不为空，比较后再加入数据siftUp(i, e);清空数据将所有的数组元素置为null;poll() 一个数据，就是获取queue[0]的数据，
然后数组其他数据向前移动一位，最后空出的位置置为null;

#### 第一周学习感想

第一次接触leetcode，我是没用任何思路的。拿到题目也是花一些时间，先理解题意，然后找到解题方法再去理解。其实，理解了解题思路，但是在写代码的时候，仍然不知道如何下手。
只有死记这些代码，但是也容易忘记。在死记得过程中，慢慢感觉到这些题还是有规律的。





