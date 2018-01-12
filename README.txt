Sorting in Java 8:
https://www.leveluplunch.com/java/tutorials/007-sort-arraylist-stream-of-objects-in-java8/

IntStream to Stream<Integer> to List<>
IntStream.boxed turns an IntStream into a Stream<Integer>, which you can then collect into a list:
theIntStream.boxed().collect(Collectors.toList())


Map items in IntStream to String
You need to call mapToObj  instead of just map, when mapping an int to an object.


Method reference (double colon)
Static method:
...
.filter(SomeObject::someStaticMethod)

Instance method:
...
SomeObject someObject = new SomeObject()
.filter(someObject.someInstanceMethod)


Remainder:
Remainder of 3/7 is 3
    since it went 0 times with 3 remainder so 3%7 = 3
7 divided by 3 is 2 with a remainder of 1
3 divided by 7 is 0 with a remainder of 3