package Week5_Generics;

public class TestGenericStack {
        public static void main(String[] args){

            //declare stack of Integer objects
            GenericStack<Integer> nums = new GenericStack<Integer>();

            System.out.println( "PUSHING ELEMENTS TO " + nums );

            //push elements to stack and print stack
            for( int i = 0; i < 10; i++ ){
                int rand = 1 + (int)(Math.random()*50); //random number between 1-50
                nums.push(rand);
                System.out.print( String.format("Pushed Element: %2d :: ", rand) );
                System.out.println( String.format("Stack size - %2d :: %s",
                        nums.getSize(), nums) );
            }

            System.out.println();
            System.out.println( "POPPING ELEMENTS FROM " + nums );

            //pop elements from stack and print stack
            for( int i = 0; i < 10; i++ ){
                System.out.print( String.format("Popped Element: %2d :: ", nums.pop()) );
                System.out.println( String.format("Stack size - %2d :: %s",
                        nums.getSize(), nums) );
            }

        }
    }

