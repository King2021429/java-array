import java.util.Collections;
import java.util.PriorityQueue;

public class Test6 {
    public static void main(String[] args) {
        //创建最小堆 最大堆
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        //添加元素
        minheap.add(50);
        minheap.add(36);
        minheap.add(15);
        minheap.add(26);
        minheap.add(12);
        minheap.add(62);
        minheap.add(72);
        minheap.add(65);

        maxheap.add(50);
        maxheap.add(60);
        maxheap.add(40);
        maxheap.add(65);
        maxheap.add(55);
        maxheap.add(20);
        maxheap.add(18);
        maxheap.add(19);
        maxheap.add(20);
        System.out.println(minheap.toString());
        System.out.println(maxheap.toString());

        //取堆顶元素
        minheap.peek();
        maxheap.peek();

        //删除堆顶元素 同时返回删除值
        minheap.poll();
        maxheap.poll();

        //size 可以用来判断空堆
        minheap.size();
        maxheap.size();

        //遍历
        while (!minheap.isEmpty()){
            System.out.println(minheap.poll());
        }

        while (!maxheap.isEmpty()){
            System.out.println(maxheap.poll());
        }
    }
}
