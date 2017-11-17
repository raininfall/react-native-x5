
# react-native-x5

## Getting started

`$ npm install raininfall/react-native-x5 --save`

### Mostly automatic installation

`$ react-native link react-native-x5`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import github.raininfall.react.x5.RNX5Package;` to the imports at the top of the file
  - Add `new RNX5Package()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-x5'
  	project(':react-native-x5').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-x5/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-x5')
  	```


## Usage
```javascript
import RNX5 from 'react-native-x5';

// TODO: What to do with the module?
RNX5;
```
  
