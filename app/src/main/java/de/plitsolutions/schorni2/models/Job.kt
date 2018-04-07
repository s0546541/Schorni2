package de.plitsolutions.schorni2.models

data class Job(
        val customerName: String,
        val address: String,
        val telephone: String,
        val information: String,
        val contraction: String,
        var cashed: Boolean,
        val finishedOn: Long,
        var notes: String
)