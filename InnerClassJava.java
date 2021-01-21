class Outer{

    private 
        String outerInstanceVariable;
    private static 
        String outerStaticVariable;
    
    public static 
        void outerStaticMethod(){
            System.out.println("outerStaticMethod method of outer class");
    }

    private 
        void outerInstanceMethod(){
            System.out.println("outerInstanceMethod method of outer class");
        }
    public
        void show(){
            System.out.println("show method of outer class");
    }
    
    /**instance member of Outer class (non - static member)*/
    public 
        class Inner{

            private 
                String innerInstanceVariable;

            private static final        //only constant(final) are allowed
                String innerStaticVariable = "innerStaticVariable";
        
            /* 
                static methods are not allowed in a member inner class
            ```````````````````````````````````````````````````````````````
                void staticMethod(){
                    System.out.println("static method of inner class");
                }
            */
            public 
                Inner(){
                    System.out.println("Inner class constructor invoked");
                    innerInstanceVariable = "innerInstanceVariable";
            }

            public 
                void show(){
                    System.out.println("show method of inner class");
                    System.out.println("    { ");
                    System.out.println("outerInstanceVariable = " + Outer.this.outerInstanceVariable);
                    System.out.println("outerStaticVariable = " + Outer.outerStaticVariable);
                    System.out.println("innerInstanceVariable = " + this.innerInstanceVariable);
                    System.out.println("innerStaticVariable = " + Outer.Inner.innerStaticVariable);
                    Outer.outerStaticMethod();
                    Outer.this.outerInstanceMethod();
                    System.out.println("    }");
            }

    }

}

class InnerClassJava{
    
    public static 
        void main(String args[]){

            Outer outerObject = new Outer();

            //accessing inner class construct through outer class object(only way to access)
            Outer.Inner innerObject = outerObject.new Inner(); 

            innerObject.show();
        }
}