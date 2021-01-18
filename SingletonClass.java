class Singleton{

    private 
        String instanceVariable;

    private static 
        Singleton singleObject = null;

    private 
        Singleton(String instanceVariable){
            this.instanceVariable = instanceVariable;
    }

    static 
        Singleton getInstance(String instanceVariable){

            if (singleObject == null){
                singleObject = new Singleton(instanceVariable);
            }
            return singleObject;
    }

    public 
        String getInstanceVariable(){
            return this.instanceVariable;
    }

    public 
        void setInstanceVariable(String instanceVariable){
            this.instanceVariable = instanceVariable;
    }
    
}

public 
    class SingletonClass {

        public static 
            void main(String args[]){

                Singleton obj1 = Singleton.getInstance("instanceVariable - obj1");
                Singleton obj2 = Singleton.getInstance("instanceVariable - obj2");

                System.out.println(obj1.getInstanceVariable());
                obj2.setInstanceVariable("instanceVariable - obj2");
                System.out.println(obj2.getInstanceVariable());
                
                System.out.println(obj1.hashCode() == obj2.hashCode());

        }
}
