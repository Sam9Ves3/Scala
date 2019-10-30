/*
                          Easy example
*/

//Create a function(TalkToSomeone) which returns a function as a result
def TalkToSomeone(prefix:String) : String => String  = (name:String) =>{
  // Sum the two variables, including a space between them 
  prefix+" "+name
  }

// Storing the  result function in a new variable (greetings)
val greetings = TalkToSomeone("Hello")
    
// As you may notice, we did not introduce any string in the variable 'name'.
// Here it is introduced:
val greetSam = greetings("Samuel")

// Print the result
println(greetSam)


/* 
                A little bit more advanced example
*/

//function taking a function as a parameter
def sum(f: (Int,Int) => Int, x:Int, y:Int): Int = {
  f(x,y)
}

// store the function to make the addition (1)
val sumOfIntegers = sum((x,y)=>x+y,10,20)
    
// Make each a squared number and sum them (2)
val sumOfSquaredIntegers = sum((x,y) => (x*x) + (y*y),2,3)
    
//Result of the sum (1)
println("Sum of 10 and 20 is "+sumOfSquaredIntegers)
    
//Result of the sum of squares numbers (2)
println("Sum of square of 2 and square of 3 is "+sumOfSquaredIntegers)


//Finally :)
println("Congratulations, now you know how functional programming looks like!")

