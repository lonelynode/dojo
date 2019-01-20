//"7777...8?!??!", exclaimed Bob, "I missed it again! Argh!" Every time there's an interesting number coming up, he notices and then promptly forgets. Who doesn't like catching those one-off interesting mileage numbers?

Let's make it so Bob never misses another interesting number. We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).

It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.



"Interesting" Numbers
Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:

Any digit followed by all zeros: 100, 90000
Every digit is the same number: 1111
The digits are sequential, incementing†: 1234
The digits are sequential, decrementing‡: 4321
The digits are a palindrome: 1221 or 73837
The digits match one of the values in the awesomePhrases array
† For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.



So, you should expect these inputs and outputs:

// "boring" numbers
CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0

// progress as we near an "interesting" number
CarMileage.isInteresting(11207, new int[]{}); // 0
CarMileage.isInteresting(11208, new int[]{}); // 0
CarMileage.isInteresting(11209, new int[]{}); // 1
CarMileage.isInteresting(11210, new int[]{}); // 1
CarMileage.isInteresting(11211, new int[]{}); // 2

// nearing a provided "awesome phrase"
CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2


Error Checking
A number is only interesting if it is greater than 99!
Input will always be an integer greater than 0, and less than 1,000,000,000.
The awesomePhrases array will always be provided, and will always be an array, but may be empty. (Not everyone thinks numbers spell funny words...)
You should only ever output 0, 1, or 2.





//"7777...8?!??!", exclaimed Bob, "I missed it again! Argh!" Every time there's an interesting number coming up, he notices and then promptly forgets. Who doesn't like catching those one-off interesting mileage numbers?

Let's make it so Bob never misses another interesting number. We've hacked into his car's computer, and we have a box hooked up that reads mileage numbers. We've got a box glued to his dash that lights up yellow or green depending on whether it receives a 1 or a 2 (respectively).

It's up to you, intrepid warrior, to glue the parts together. Write the function that parses the mileage number input, and returns a 2 if the number is "interesting" (see below), a 1 if an interesting number occurs within the next two miles, or a 0 if the number is not interesting.



"Interesting" Numbers
Interesting numbers are 3-or-more digit numbers that meet one or more of the following criteria:

Any digit followed by all zeros: 100, 90000
Every digit is the same number: 1111
The digits are sequential, incementing†: 1234
The digits are sequential, decrementing‡: 4321
The digits are a palindrome: 1221 or 73837
The digits match one of the values in the awesomePhrases array
† For incrementing sequences, 0 should come after 9, and not before 1, as in 7890.
‡ For decrementing sequences, 0 should come after 1, and not before 9, as in 3210.



So, you should expect these inputs and outputs:

// "boring" numbers
CarMileage.isInteresting(3, new int[]{1337, 256});    // 0
CarMileage.isInteresting(3236, new int[]{1337, 256}); // 0

// progress as we near an "interesting" number
CarMileage.isInteresting(11207, new int[]{}); // 0
CarMileage.isInteresting(11208, new int[]{}); // 0
CarMileage.isInteresting(11209, new int[]{}); // 1
CarMileage.isInteresting(11210, new int[]{}); // 1
CarMileage.isInteresting(11211, new int[]{}); // 2

// nearing a provided "awesome phrase"
CarMileage.isInteresting(1335, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1336, new int[]{1337, 256}); // 1
CarMileage.isInteresting(1337, new int[]{1337, 256}); // 2


Error Checking
A number is only interesting if it is greater than 99!
Input will always be an integer greater than 0, and less than 1,000,000,000.
The awesomePhrases array will always be provided, and will always be an array, but may be empty. (Not everyone thinks numbers spell funny words...)
You should only ever output 0, 1, or 2.

2402/5000
//“7777 ... 8？！??！”，鲍勃喊道，“我再次错过了！唉！”每当有一个有趣的数字出现时，他会注意到然后立即忘记。谁不喜欢抓住那些一次性有趣的里程数？

让我们这样做，这样鲍勃就不会错过另一个有趣的数字。我们已经入侵了他的汽车的电脑，我们有一个连接起来读取里程数的盒子。我们有一个粘在他的仪表板上的盒子，它会亮起黄色或绿色，这取决于它是分别收到1还是2。

由勇敢的战士来决定将部件粘合在一起。编写解析里程数输入的函数，如果数字是“有趣”（见下文）则返回2，如果在接下来的两英里内发生有趣数字，则返回1，如果数字不感兴趣则返回0。



“有趣的”数字
有趣的数字是满足以下一个或多个标准的3位或更多位数字：

任何数字后跟全零：100,90000
每个数字都是相同的数字：1111
数字是连续的，入是†：1234
数字是连续的，递减‡：4321
数字是回文：1221或73837
数字与awesomePhrases数组中的一个值匹配
†对于递增序列，0应该在9之后，而不是在1之前，如7890。
‡对于递减序列，0应该在1之后，而不是在9之前，如在3210中。



所以，您应该期望这些输入和输出：

//“无聊”的数字
CarMileage.isInteresting（3，new int [] {1337,256}）; // 0
CarMileage.isInteresting（3236，new int [] {1337,256}）; // 0

//因为我们接近一个“有趣”的数字
CarMileage.isInteresting（11207，new int [] {}）; // 0
CarMileage.isInteresting（11208，new int [] {}）; // 0
CarMileage.isInteresting（11209，new int [] {}）; // 1
CarMileage.isInteresting（11210，new int [] {}）; // 1
CarMileage.isInteresting（11211，new int [] {}）; // 2

//接近提供的“真棒短语”
CarMileage.isInteresting（1335，new int [] {1337,256}）; // 1
CarMileage.isInteresting（1336，new int [] {1337,256}）; // 1
CarMileage.isInteresting（1337，new int [] {1337,256}）; // 2


错误检查
一个数字只有在大于99时才有意思！
输入将始终是大于0且小于1,000,000,000的整数。
将始终提供awesomePhrases数组，并且始终是一个数组，但可能为空。 （不是每个人都认为数字拼写有趣的单词......）
您应该只输出0,1或2。