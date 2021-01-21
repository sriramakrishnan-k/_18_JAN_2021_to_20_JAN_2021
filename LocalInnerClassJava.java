public class LocalInnerClassJava {
    public static void main(String args[]){
        int a = 20;
        String s = "Nothing";

        // This class is available only with in this method
        class LocalInnerClass{

            public String 
                instanceVariable;
            
            // only constants are allowed if it is a static field
            public static final 
                String staticVariable = "Static Variable";

            /*
                static methods are not allowed
            */

            {
                System.out.println(" \" intializer block of local inner class \" ");
            }

            public 
                LocalInnerClass(){
                    instanceVariable = " Instance Variable ";
            }

            public 
                void instanceMethod(){
                    System.out.println("Local inner class can access a local variable of enclosing method");
                    System.out.println(" a = " + a );
                    System.out.println(" s = " + s );
                    System.out.println("instanceVariable = " + instanceVariable);
                    System.out.println("staticVariable = " + staticVariable);
            }

        }
        
        LocalInnerClass object = new LocalInnerClass();
        object.instanceMethod();
    }
}
