var fibonacci_series = function (n)
{
    if(n==1)
    {
        return[0,1];
    }
    else
    {
        var s= fibonacci_series(n-1);
        s.push(s[s.length-1] + s[s.length-2]);
        return s;

    }
    };
    console.log(fibonacci_series(9));
console.log('======================');
 function fact(n){
     if(n==0 ||   n==1){
         return 1;

     }
     else{
         return fact(n-1)*n;

     }
 }
 let factorialvalue= fact(6);
 console.log(factorialvalue);
 console .log("================")
 function circle(radius)
{
    this.radius = radius;
  // area method
    this.area = function () 
    {
        return Math.PI * this.radius * this.radius;
    };
  // perimeter method
    this.perimeter = function ()
    {
        return 2*Math.PI*this.radius;
    };
}
var c = new circle(2);
console.log('Area =', c.area().toFixed(2));
console.log('perimeter =', c.perimeter().toFixed(2));
console.log
