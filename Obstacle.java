class Obstacle{
    //permanent location
    //player can rest
    //player can hide
    //player can gather
    public class Tree extends Obstacle{
        public int numOfSticks = 0;
        //when agent approaches tree
        numOfSticks++;
    }
    public class Rock extends Obstacle{
            
    }
    public class Bush extends Obstacle{
        public int numOfBerries = 0;
            //when abgent approaches Bush
        numofBerries++; 
        }
    }
