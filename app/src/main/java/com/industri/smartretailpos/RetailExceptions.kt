package com.industri.smartretailpos

import java.io.IOException

// 1. Barcode barang tidak ditemukan
class ProductBarcodeNotFoundException(
    val barcode: String
) : Exception(
    "Barang dengan barcode [$barcode] tidak terdaftar pada katalog sistem."
)

// 2. Payment gateway timeout
class PaymentGatewayTimeoutException(
    val gatewayName: String
) : IOException(
    "Layanan pembayaran $gatewayName tidak merespons dalam 15 detik."
)

// 3. Limit kasir terlampaui
class CashierLimitExceededException(
    val maxLimit: Double
) : Exception(
    "Total transaksi melebihi limit otorisasi kasir mandiri (Maksimal Rp %,.0f)"
        .format(maxLimit)
)