
package cn.javass.spring.chapter2.helloworld;  //æ≤Ã¨π§≥ß¿‡  
import cn.javass.spring.chapter2.helloworld.HelloApi;  
public class DependencyInjectByStaticFactory {  
       public static HelloApi newInstance(String message, int index) {  
              return new HelloImpl(message, index);  
       }  
}  