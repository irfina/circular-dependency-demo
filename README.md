# Spring's Beans Circular Dependency Demo

This simple app will show a circular dependency among classes anotated as spring bean.

```
┌─────┐
|  ClassA
↑     ↓
|  ClassB
↑     ↓
|  ClassC
└─────┘
```
and 
```
┌─────┐
|  ClassX
↑     ↓
|  ClassY
└─────┘
```

Thus, spring boot application will failed to start.