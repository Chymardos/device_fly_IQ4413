LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

#ALL_PREBUILT += $(INSTALLED_KERNEL_TARGET)

# call the proprietary setup
$(call inherit-product, vendor/fly/IQ4413/IQ4413-vendor.mk)	
