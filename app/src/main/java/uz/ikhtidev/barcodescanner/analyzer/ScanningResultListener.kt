package uz.ikhtidev.barcodescanner.analyzer

interface ScanningResultListener {
    fun onScanned(result: String)
}