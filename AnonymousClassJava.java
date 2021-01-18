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
                
                static final 
                    int staticVariable = 200; // final value are allowed (if static it is a static field)
                
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
                construct is not allow
                but instance initializer block is allowed
                */

                public 
                    void function(){
                        System.out.println(" function in anonymous ");
                        System.out.println("static variable  = "  + staticVariable);
                        System.out.println("instance variable = " + instanceVariable);
                }

            }.function();

            /* if we try to store the object of anonymous class in Object type variables
                like
                    Object obj = new Object(){
                                                static fields,
                                                static methods,
                                                instance attributes,
                                                instance methods,
                                                overrided methods
                                             };

                    * we can access the overrided methods using obj *
                   ( *** ) remaining members are not access through obj.
            */
    }
}
