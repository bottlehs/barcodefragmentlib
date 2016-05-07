# Below content describes the usage of library #

Barcode Fragment Library is an extension to the existing ZXing library. Which Provides the barcode scanner as a Fragment, which can be placed on any Activity

### Download the Library which comes along with sample layout and activity demonstrating the usage of barcode fragment library. ###

Since, Library is extension of **ZXing**, hence, in order to use the **barcodefragmentlib** you need to add core.jar in your build path.

The library requires a call back to be registered as IResultCallback.

Once registered with Fragment as setmCallBack the result will be forwarded.

**EXAMPLE**
```
fragment = (BarCodeFragment) getSupportFragmentManager()
				.findFragmentById(R.id.barCode);
fragment.setmCallBack(this);
```


**Starting and Stopping Camera for QR Capture**

`fragment.startCameraCampure()` is internally called by the library at the time of instantiation of library itself, hence you should not call it for starting the camera. This function should only be called after QR Result was received or camera was stopped pragmatically.

```
if(!fragment.isCameraActive()){
	fragment.startCameraCampure();
}else
	fragment.stopCameraCapture();
```


Once the capture is complete the library automatically calls `stopCameraCapture` hence you can restart QR code detection by simply calling `startCameraCapture`.

You don't have to call the start and stop camera actions in your activity for activity state changes as the library takes care of state change by itself.