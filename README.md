# Spark Android SDK Wrapper

## Embed video calling capabilities into your Android App in just a few lines of code

This Simple Test application demonstrates the Spark Android SDK Wrapper.

The Spark Android SDK Wrapper is an unofficial convenience library written on top of the Cisco Spark Android SDK. The purpose of this project is provide a super simple way to add video calling into your app. This wrapper library provides a reference implementation of the SparkSDK as a drop in Activity that you can add into your existing app to video capabilities without needing to know how to use the SparkSDK.

This wrapper handles layout of the video streams for local and remote participants, the call setup process, in call functionality such as muting, as well as hanging up the call.

What that means is that you just need to start the SparkCall activity with an Intent and pass in the SparkID to call as well as the Guest Token (JWT) for your application.


## Requirements

Download or clone this repository and import it into Android Studio as a new project.


## Implementation
The SparkSDKWrapper uses an Activity as a drop in to display the Video call.  You will need to start the activity by passing an intent with your Guest Token and the SparkID to call.

You can look at the sample MainActivity to see how this is done.  In this case, the onClick listener invokes the SparkCall activity by intent.

```
Intent intent = new Intent(MainActivity.this, SparkCall.class);
intent.putExtra(SparkCall.INTENT_CALLEE, mCallEdit.getText().toString());
intent.putExtra(SparkCall.INTENT_JWT, mTokenEdit.getText().toString());

startActivity(intent);
```

In this example, the call is started based on the contents of two EditText fields.  Just modify with your token and the SparkID to call and you are all set and ready to go!

The SparkCall activity will return control back to your activity in the event of a call failure or a hangup event.


## License
SparkSDKWrapper is available under the MIT license. See the LICENSE file for more info.
