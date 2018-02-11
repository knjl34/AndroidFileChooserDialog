package net.dankito.filechooserdialog.model


data class FileChooserDialogConfig @JvmOverloads constructor(
        val extensionsFilters: List<String> = listOf(),
        val showHorizontalItemDividers: Boolean = true
)