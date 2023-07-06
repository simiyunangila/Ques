    fun main(){
        var a =Queue(6)
        a.enqueue(3)
        a.enqueue( 4)
        a.enqueue(7)
        a.enqueue(6)
        a.display()
        a.dequeue()
        a.dequeue()
        a.enqueue(3)
        a.enqueue(5)
        a.dequeue()
        a.enqueue(7)
        a.enqueue(8)
        a.enqueue(1)
        a.enqueue(3)
        a.enqueue(5)
        println("---------")
        println(a.display())
    }
    class Queue(var capacity:Int){
        var data = IntArray(capacity)
        var front=0
        var rear =0
        fun enqueue(value: Int){
            if(isFull()){
                println("Queue is full")
                return
            }
            data[rear] =value
            rear++
        }
        fun dequeue():Int?{  //
            if(isEmpty()){
                println("Queue is empty")
                return null
            }
            var removed =data[front]
            for(i in front until  rear -1){
                data[i] =data[i+1]
            }
            rear--
            return removed
        }
        fun isFull():Boolean{
            return rear ==capacity
        }
        fun isEmpty():Boolean{
            return front ==rear
        }
        //    fun peek():Int?{
//        if(isEmpty()){
//            println("queue is empty")
//            return
//        }
//    }
        fun display(){
            if(isEmpty()){
                println("Queue is empty")
                return
            }
            for(i in front until rear){
                println(data[i])
            }
        }
    }


