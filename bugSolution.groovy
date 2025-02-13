```groovy
def myMethod(a, b) {
  a = a ?: 0 // Use the Elvis operator to provide a default value of 0 for null
  b = b ?: 0 // if a or b is null, set it to 0
  return a + b
}

println myMethod(null, 5) // Output: 5
println myMethod(10, null) // Output: 10
println myMethod(null, null) // Output: 0

//Alternative solution using the safe navigation operator (?.)
def myMethod2(a,b){
  return (a?.toString() ?: "0") + (b?.toString() ?: "0")
}
println myMethod2(null,5) //Output: 05
println myMethod2(10,null) //Output: 100
println myMethod2(null,null) //Output: 00
```