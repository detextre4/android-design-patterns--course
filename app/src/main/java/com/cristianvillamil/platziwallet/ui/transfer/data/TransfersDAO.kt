package com.cristianvillamil.platziwallet.ui.transfer.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TransfersDAO {
    @Query("SELECT * FROM transfers")
    fun getAll() : List<TransferEntity>

    @Query("SELECT * FROM transfers WHERE username LIKE :username")
    fun findTransferByUsername(username : String) : List<TransferEntity>

    @Insert
    fun saveTransfer(transferEntity: TransferEntity)

    @Delete
    fun delete(transfer: TransferEntity)
}