abstract 
    class Anonymous{

        abstract public
            void show();

        public 
            Anonymous(){
                System.out.println("construct of abstract class Anonymous");
        }

}

interface AnonymousInterface{

        abstract public void display();

}

public 
    class AnonymousClassJava {

    public static 
        void main(String args[]){

        // anonymous class extends Anonymous
            Anonymous objectAnonymous = new Anonymous(){

                public 
                    int anonymousInstanceVariable = 2000;
                
                //instance initializer
                {
                    System.out.println("instance initializer in Anonymous_class");

                    System.out.println("anonymousInstanceVariable = " + anonymousInstanceVariable);
                    anonymousInstanceVariable = 5000;
                    System.out.println("anonymousInstanceVariable = " + anonymousInstanceVariable);
                }

                @Override public 
                    void show(){
                        System.out.printf("show member in Anonymous Class");                                       
                }

            };

            objectAnonymous.show();
            objectAnonymous.show();
            

            AnonymousInterface objectAnonymousInterface = new AnonymousInterface(){

                @Override public
                    void display(){
                        System.out.println("display member in Anonymous Interface");
                }

            };

            objectAnonymousInterface.display();


            // all the classes in java extends Object class
            // hence to create a anonymous class it is better to use Object class name
            new Object(){
                
                // final value are allowed ( only constant )
                static final 
                    int staticVariable = 200;
                
                int instanceVariable = 101;

                // instance initializer block
                {
                    System.out.println("before --> instanceVariable = "+ this.instanceVariable);
                    System.out.println("instance initializer block of anonymous class(Object class extended)");
                    this.instanceVariable = 10001;
                    System.out.println("After --> instanceVariable = "+ this.instanceVariable);
                }

                /* 
                    static initializer block is not allowed in anonymous class 
                    static methods are not allowed
                    constructor is not allowed
                    but instance initializer block is allowed
                */

                // function which calls remaining fuctions 
                public 
                    void function(){
                        System.out.println(" function in anonymous ");
                        System.out.println("static variable  = "  + staticVariable);
                        System.out.println("instance variable = " + instanceVariable);
                        this.additionalMethod();
                        this.extraMethod();
                }

                public 
                    void additionalMethod(){
                        System.out.println("Additional method in anonymous class");
                }

                public 
                    void extraMethod(){
                        System.out.println("Extra method in anonymous class");
                }

            }.function();

            // use one function to call remaining methods.

            /* if we try to store the object of anonymous class in Object type variables
                like
                    Object obj = new Object(){
                                                static fields(constants only),

                                                ********************************
                                                  static methods (not allowed),   
                                                  constructor    (not allowed)       
                                                ********************************

                                                instance attributes,
                                                instance methods,
                                                overrided methods

                                             };

                    * we can access the overrided methods using obj *
                   ( *** ) remaining members are not access through obj.
            */
    }
}
