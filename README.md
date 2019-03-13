# react-native-screenshot-helper

## Getting started

`$ npm install react-native-screenshot-helper --save`

### Mostly automatic installation

`$ react-native link react-native-screenshot-helper`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-screenshot-helper` and add `RNScreenshotHelper.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNScreenshotHelper.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.RNScreenshotHelperPackage;` to the imports at the top of the file
  - Add `new RNScreenshotHelperPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-screenshot-helper'
  	project(':react-native-screenshot-helper').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-screenshot-helper/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-screenshot-helper')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNScreenshotHelper.sln` in `node_modules/react-native-screenshot-helper/windows/RNScreenshotHelper.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Screenshot.Helper.RNScreenshotHelper;` to the usings at the top of the file
  - Add `new RNScreenshotHelperPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNScreenshotHelper from 'react-native-screenshot-helper';

// TODO: What to do with the module?
RNScreenshotHelper;
```
  