package com.survivalcoding.noteapp.presentation.notes.adapter

import android.graphics.PorterDuff
import androidx.recyclerview.widget.RecyclerView
import com.survivalcoding.noteapp.databinding.ItemNoteBinding
import com.survivalcoding.noteapp.domain.model.Note

class NoteViewHolder(private val binding: ItemNoteBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(note: Note, onClick: (Note) -> Unit, onDelete: (Note) -> Unit) {
        binding.titleTv.text = note.title
        binding.contentTv.text = note.content
        binding.root.backgroundTintMode = PorterDuff.Mode.MULTIPLY
        binding.backgroundIv.setColorFilter(note.color, PorterDuff.Mode.MULTIPLY);
        binding.foldIv.setColorFilter(note.color, PorterDuff.Mode.MULTIPLY);
        binding.root.setOnClickListener { onClick(note) }
        binding.deleteIb.setOnClickListener { onDelete(note) }
    }
}