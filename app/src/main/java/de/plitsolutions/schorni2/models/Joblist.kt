package de.plitsolutions.schorni2.models

data class Joblist(
        var name: String,
        val createdOn: Long,
        var jobs: List<Job>
)