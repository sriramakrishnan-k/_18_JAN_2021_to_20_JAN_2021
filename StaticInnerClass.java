
class Outer{

    // static member

    public static 
    class Inner{

        // Static Members

        public static 
        String staticVariableInner = "static inner class (Static Variable)";
        
        public static 
        void staticMethodInner(){
           System.out.println("static member function of inner class");  
        }

        // Instance Members

        public 
        String instanceVariableInner; 
        
        public 
        Inner(String instanceVariable){
            this.instanceVariableInner = instanceVariable;
        }

        public  
        void instanceMethodInner(){
            System.out.println("Instance member function of inner class"); 
            System.out.println(Outer.staticVariableOuter);
            System.out.println("}");
        }

    }

    public static 
    String staticVariableOuter = "Outer class (Static Variable)";
    
    public static 
    void staticMethodOuter(){
       System.out.println("static member function of Outer class {"); 
    }

    // Instance Members

    public 
    String instanceVariableOuter; 
    
    public 
    Outer(String instanceVariable){
        this.instanceVariableOuter = instanceVariable;
    }

    public  
    void instanceMethodOuter(){
       System.out.println("Instance member function of Outer class");  
    }

}


public 
class StaticInnerClass {

    public static
    void main(String args[]){
       Outer.Inner objInner = new Outer.Inner("instanceVariable of inner class");
       objInner.staticMethodInner();
    }
}
