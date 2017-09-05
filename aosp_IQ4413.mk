## Specify phone tech before including full_phone

# Release name
PRODUCT_RELEASE_NAME := Fly IQ4413

# Inherit some common LineageOS stuff.
$(call inherit-product, vendor/aosp/common.mk)

# Inherit device configuration
$(call inherit-product, device/fly/IQ4413/full_IQ4413.mk)

# Device identifier. This must come after all inclusions
PRODUCT_DEVICE := IQ4413
PRODUCT_NAME := aosp_IQ4413
PRODUCT_BRAND := Fly
PRODUCT_MODEL := IQ4413
PRODUCT_MANUFACTURER := Fly
