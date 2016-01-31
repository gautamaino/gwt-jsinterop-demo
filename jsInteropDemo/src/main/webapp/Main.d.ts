declare module GwtHost{
    
    export interface JList<E> {
    
         push( t : E) : void ;
        
         pop() : E;
        
         length() : number ;
        
         toJsArray() : E[];
    
    }
    
    export class Person {
  
        name :String ;
        
        age : number ;

        public getAddresses() : JList<Address> ;
        
    }
    
    export class Address {
        
        public  getStreet() : String ;
	
    }
        
    
    
    
}