Example use case:
https://stackoverflow.com/questions/1710809/when-and-why-should-the-strategy-pattern-be-used

``` Java
interface GraphStrategy {
    Image renderGraph(Data graphData);
}

class BigGraphStrategy implements GraphStrategy {
    ...
}

class SmallGraphStrategy implements GraphStrategy {
    ...
}
Then in some other code:

GraphStrategy graphStrategy;

if (phoneBrowser == true) { 
    graphStrategy = new SmallGraphStrategy();
} else {
    graphStrategy = new BigGraphStrategy();
}
```
The rest of your application code can then just use graphStrategy.renderGraph() without having to know whether full or small image rendering is being performed.
