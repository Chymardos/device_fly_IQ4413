# Full base
$(call inherit-product, $(SRC_TARGET_DIR)/product/full_base.mk)

# Needed stuff
$(call inherit-product, $(SRC_TARGET_DIR)/product/languages_full.mk)

# Call device specific makefile
$(call inherit-product, device/fly/IQ4413/IQ4413.mk)

LOCAL_PATH := device/fly/IQ4413

PRODUCT_BUILD_PROP_OVERRIDES += BUILD_FINGERPRINT=fly/IQ4413/IQ4413:6.0.1/MMB29M/2419427:user/release-keys PRIVATE_BUILD_DESC="IQ4413-user 6.0.1 MMB29M 2419427 release-keys"

PRODUCT_BUILD_PROP_OVERRIDES += \
    PRODUCT_DEVICE="IQ4413"

# IO Scheduler
PRODUCT_PROPERTY_OVERRIDES += \
    sys.io.scheduler=bfq    
       
PRODUCT_NAME := full_IQ4413
PRODUCT_DEVICE :=IQ4413
PRODUCT_BRAND := Fly
PRODUCT_MANUFACTURER := Fly
PRODUCT_MODEL := IQ4413

# Correct bootanimation size for the screen
TARGET_SCREEN_HEIGHT := 960
TARGET_SCREEN_WIDTH := 540

# set locales & aapt config.
PRODUCT_LOCALES := ru_RU en_US
PRODUCT_AAPT_CONFIG := normal hdpi
PRODUCT_AAPT_PREF_CONFIG := hdpi

# Inherit some common CM stuff.

CM_BUILD :=IQ4413

ADDITIONAL_DEFAULT_PROPERTIES += ro.adb.secure=0
ADDITIONAL_DEFAULT_PROPERTIES += ro.secure=0

PRODUCT_DEFAULT_PROPERTY_OVERRIDES += \
	persist.sys.usb.config=mtp
	
PRODUCT_PROPERTY_OVERRIDES += \
  persist.service.adb.enable=1 \
  persist.service.debuggable=1 \
  persist.sys.usb.config=mtp,adb

$(call inherit-product, vendor/cm/config/common_full_phone.mk)
