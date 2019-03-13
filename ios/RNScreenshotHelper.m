#import "RNScreenshotHelper.h"

@implementation RNScreenshotHelper
RCT_EXPORT_MODULE();

- (NSArray<NSString *> *)supportedEvents {
    return @[@"screenshot_taken"];
}

- (void)startObserving {
    NSLog(@"start observing screenshot taken notification");
    [[NSNotificationCenter defaultCenter] addObserver:self selector:@selector(screenshotTaken) name:UIApplicationUserDidTakeScreenshotNotification object:nil];
}

- (void)stopObserving {
    NSLog(@"stop observing screenshot taken notification");
    [[NSNotificationCenter defaultCenter] removeObserver:self];
}

- (void)screenshotTaken {
    [self sendEventWithName:@"screenshot_taken" body:nil];
}

- (NSDictionary *)constantsToExport {
    return @{
             @"screenshotTakenEventName": @"screenshot_taken"
             };
}


@end
