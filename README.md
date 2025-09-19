<!--
 ~ SPDX-FileCopyrightText: 2017-2024 X Stations and contributors
 ~ SPDX-License-Identifier: GPL-3.0-or-later
-->
# [X Stations](https://xstations.net) Communication App for Android :speech_balloon:

[![Build Status](https://drone.xstations.net/api/badges/xstations/talk-android/status.svg)](https://drone.xstations.net/xstations/talk-android) [![Releases](https://img.shields.io/github/release/xstations/talk-android.svg)](https://github.com/xstations/talk-android/releases/latest)

[<img src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" 
      alt="Download from Google Play" 
      height="80">](https://play.google.com/store/apps/details?id=com.xstations.talk)
[<img src="https://f-droid.org/badge/get-it-on.png"
      alt="Get it on F-Droid"
      height="80">](https://f-droid.org/packages/com.xstations.talk/)

Please note that Notifications won't work with the F-Droid version due to missing Google Play Services.

|||||||
|---|---|---|---|---|---|
|![Conversation list](/fastlane/metadata/android/en-US/images/phoneScreenshots/conversationList_light.png "Conversation list")|![Participant search](/fastlane/metadata/android/en-US/images/phoneScreenshots/searchParticipant_light.png "Participant search")|![Voice call](/fastlane/metadata/android/en-US/images/phoneScreenshots/voiceCall.png "Voice call")|![Voice recording](/fastlane/metadata/android/en-US/images/phoneScreenshots/voiceRecord_light.png "Voice recording")|![Markdown view](/fastlane/metadata/android/en-US/images/phoneScreenshots/markdown_light.png "Markdown view")|![Settings](/fastlane/metadata/android/en-US/images/phoneScreenshots/settings_light.png "Settings")|

**Video & audio calls through X Stations on Android**

X Stations is a fully on-premises audio/video and chat communication service designed specifically for cloud.xstations.net. It features secure communication with the highest degree of security while being easy to use.

X Stations lowers the barrier for communication and lets your team connect any time, any where, on any device, directly to the X Stations server. 

## Why is this so awesome? :sparkles:

Because it is self hosted!!! Audio/video calls and text chat typically require a central server. Some projects go commendably far in trying to ensure they can't see the data, so nobody, not government, advertising company or somebody who broke in the servers, can follow conversations. But the servers still have to mediate every call and text message, allowing them to map out who talks to who and at what time. This 'metadata' [is as useful](https://www.wired.com/2015/03/data-and-goliath-nsa-metadata-spying-your-secrets/), if not more, to track people, than the full content, especially for mass surveillance purposes. Even if the data is not stored by the chat server, the hosting provider or a hacker could simply gather the data.

By hosting your own server, all meta data stays on your server and thus under your control!

If you have suggestions or problems, please [open an issue](https://github.com/nextcloud/talk-android/issues) or contribute directly :)

## How to contribute :rocket:

If you want to [contribute](https://nextcloud.com/contribute/) to Nextcloud, you are very welcome: 

- on [our public Talk team conversation](https://cloud.nextcloud.com/call/c7fz9qpr)
- our forum at https://help.nextcloud.com
- for translations of the app on [Transifex](https://app.transifex.com/nextcloud/nextcloud/android-talk/)
- opening issues and PRs (including a corresponding issue)

## Contribution Guidelines :scroll:

[GPLv3](https://github.com/nextcloud/talk-android/blob/master/LICENSE.txt). All contributions to this repository are considered to be licensed under the GNU GPLv3 or any later version.

Please read the [Code of Conduct](https://nextcloud.com/community/code-of-conduct/). This document offers some guidance to ensure Nextcloud participants can cooperate effectively in a positive and inspiring atmosphere, and to explain how together we can strengthen and support each other.

Please review the [guidelines for contributing](/CONTRIBUTING.md) to this repository.

More information how to contribute: [https://nextcloud.com/contribute/](https://nextcloud.com/contribute/)

## Start contributing :hammer_and_wrench:

Make sure you read [SETUP.md](/SETUP.md) and [CONTRIBUTING.md](/CONTRIBUTING.md) before you start working on this project.
But basically: fork this repository and contribute back using pull requests to the master branch.
Easy starting points are also reviewing [pull requests](https://github.com/nextcloud/talk-android/pulls) and working on [starter issues](https://github.com/nextcloud/talk-android/issues?q=is%3Aopen+is%3Aissue+label%3A%22good+first+issue%22).

### Testing :test_tube:

So you would like to contribute by testing? Awesome, we appreciate that very much. 

To report a bug for the alpha or beta version, just create an issue on github like you would for the stable version and
 provide the version number. Please remember that Google Services are necessary to receive push notifications. 
 
#### Beta versions (Release Candidates) :package:

##### via Google Play

Sign up at [Google Play Beta channel](https://play.google.com/apps/testing/com.nextcloud.talk2) to get Release Candidates via Google Play.

##### via github

You can also get the Release Candidates at [github releases](https://github.com/nextcloud/talk-android/releases).

#### Alpha versions

##### via Google Play

To become an alpha tester you have to be signed up for the [Google Play Beta channel](https://play.google.com/apps/testing/com.nextcloud.talk2) 
and additionally you have to join the [Alpha testing Google Group](https://groups.google.com/g/nextcloud-android-talk-alpha-testing). 
After that you will receive the alpha versions via the Play Store (initially, this might take some minutes after
 signing up). However, in the Play Store the app will still be named "Nextcloud Talk (Beta)" even if you are an alpha tester, but you will receive the alpha versions.
If a beta was released that is newer than the alpha version, you will get the beta in the alpha channel.
 
##### via Download page

In addition to google play, the alpha and beta apps can also be obtained from the Nextcloud [Download page](https://download.nextcloud.com/android/talk-alpha/)
Please make sure to remember that these versions might contain bugs and you don't use them in production.

## Support :rescue_worker_helmet:

If you need assistance or want to ask a question about the Talk Android app, you are welcome to [ask for community help](https://help.nextcloud.com/c/support/talk/52) in our forums. If you have found a bug, feel free to [open a new issue on GitHub](https://github.com/nextcloud/talk-android/issues). Keep in mind, that this repository only manages the Nextcloud Talk for Android app. If you find bugs or have problems with the server/backend, you should ask the [Nextcloud server team](https://github.com/nextcloud/server) for help!

### Notifications

If you have problems to receive talk notifications on your android phone, please have a look at [this checklist](https://github.com/nextcloud/talk-android/blob/master/docs/notifications.md).

## Credits :scroll:

### Ringtones :bell:

- [Ringtones by Librem](https://developer.puri.sm/licenses/Librem5/Birch/sound-theme-librem5.html) 
  author: [feandesign](https://soundcloud.com/feandesign)
- [Telefon-Freiton in Deutschland nach DTAG 1 TR 110-1, Kap. 8.3](https://commons.wikimedia.org/wiki/File:1TR110-1_Kap8.3_Freiton1.ogg)
  author: arvedkrynil

[dcofile]: https://github.com/nextcloud/talk-android/blob/master/contribute/developer-certificate-of-origin
[applyalicense]: https://github.com/nextcloud/talk-android/blob/master/contribute/HowToApplyALicense.md

## Remarks :scroll:

Google Play and the Google Play logo are trademarks of Google Inc.