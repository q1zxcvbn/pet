package pet;

public class Pet {

String name;
private int age;
private int kind;
public int getKind() {
	return kind;
}
public void setKind(int kind) {
	this.kind = kind;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>10||age<0){
		System.out.println("Êı¾İ´íÎó");
	
	}else
	{
	this.age = age;
	}
}
public void eat(String dinner){
	System.out.println(name+"ÕıÔÚ³Ô"+age+dinner);
}
public void sleep(){
	System.out.println(name+"Ã¨Ë¯¾õÁË¡£¡£¡£");
	
}
public  String bark(){
	return "ß÷ß÷£¡";
}


}
