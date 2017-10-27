//Rahul Singh Thakur


1) Data Structure and algorithms in java by Robert Lafore was really helpful for a quick review of concepts

2) for stack implementation I used different test cases such as taking no input,resizing the array and Emptystack exceptions on following functions such as push,pop and peek before actually using the given data


3) other than java.util.EmptyStackException no other class implementation were used


4) it depends upon small array value for both 1 million lines and also for 1 billion lines since consider small array value as 10 and data values are 10 it will take zero occurrence and for 20 data values it will be 1 iteration and so on. 


5)if we were given FIFO queue then while performing enqueue we have to invert the order of queue elements when pushing a new element 


6) push(){
    queue.add(x);
    size1 = queue.size();
    while(size1 > 1)
{
  queue.add(queue.remove());
 size1--;
  }
 }
    pop(){
    queue.remove();
    size--;
     }
    isEmpty(){
     if(top = 0)
     return;
    }


7)if we use queue in stack implementation then we have to call the queue function and invert the data which takes more time and resources to complete the program which is worse. Even in other approaches We have to take more than one queue to perform data manipulation.
