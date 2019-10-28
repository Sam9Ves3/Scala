//                             1
// Case class example
case class employee (name:String, age:Int) 

var c = employee("Nidhi", 23) 
          
// Display both Parameter  
println("Name of the employee is " + c.name);  
println("Age of the employee is " + c.age);  





//                                2

// Case class example
case class Student (name:String, age:Int)

// values assigned to the case class
val s1 = Student("Nidhi", 23) 

// Display parameter 
println("Name is " + s1.name); 
println("Age is " + s1.age); 

//Copy with a variation
val s2 = s1.copy(age = 24) 
          
// Display copied data 
println("Copy Name " + s2.name); 
println("Copy Age " + s2.age);



//                         3
        
// calling test method 
println(test(1));

// method containing match keyword 
def test(x:Int): String = x match { 
         
// if value of x is 0 this case will be executed 
case 0 => "Hello, Guys!"
         
// if value of x is 1 this case will be executed 
case 1 => "Are you learning Scala?"
         
// if x doesnt match any sequence, 
// then this case will be executed 
case _ => "Good Luck!!"
}




//                             4

// the pattern matching 

// calling test method 
println(test("UPY")); 

// method containing match keyword 
def test(x:String): String = x match { 
          
  // if value of x is "G1" this case will be executed 
  case "G1" => "GFG"
          
  // if value of x is "G2" this case will be executed 
  case "G2" => "Scala Tutorials"
          
  // if x doesnt match any sequence then this case will be executed 
  case _ => "Default Case Executed"
}