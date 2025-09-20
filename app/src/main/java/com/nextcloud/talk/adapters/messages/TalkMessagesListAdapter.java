/*
 * Nextcloud Talk - Android Client
 *
 * SPDX-FileCopyrightText: 2024 Christian Reiner <foss@christian-reiner.info>
 * SPDX-FileCopyrightText: 2020 Tobias Kaminsky <tobias.kaminsky@nextcloud.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package com.nextcloud.talk.adapters.messages;

import com.nextcloud.talk.chat.ChatActivity;
import com.stfalcon.chatkit.commons.ImageLoader;
import com.stfalcon.chatkit.commons.ViewHolder;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.messages.MessageHolders;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

import java.util.List;

public class TalkMessagesListAdapter<M extends IMessage> extends MessagesListAdapter<M> {
    private final ChatActivity chatActivity;

    public TalkMessagesListAdapter(
        String senderId,
        MessageHolders holders,
        ImageLoader imageLoader,
        ChatActivity chatActivity) {
        super(senderId, holders, imageLoader);
        this.chatActivity = chatActivity;
    }
    
    public List<MessagesListAdapter.Wrapper> getItems() {
        return items;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (holder instanceof IncomingTextMessageViewHolder) {
            IncomingTextMessageViewHolder holderInstance = (IncomingTextMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
        } else if (holder instanceof OutcomingTextMessageViewHolder) {
            OutcomingTextMessageViewHolder holderInstance = (OutcomingTextMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
            holderInstance.adjustIfNoteToSelf(chatActivity.getCurrentConversation());

        } else if (holder instanceof IncomingLocationMessageViewHolder) {
            IncomingLocationMessageViewHolder holderInstance = (IncomingLocationMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
        } else if (holder instanceof OutcomingLocationMessageViewHolder) {
            OutcomingLocationMessageViewHolder holderInstance = (OutcomingLocationMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
            holderInstance.adjustIfNoteToSelf(chatActivity.getCurrentConversation());

        } else if (holder instanceof IncomingLinkPreviewMessageViewHolder) {
            IncomingLinkPreviewMessageViewHolder holderInstance = (IncomingLinkPreviewMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
        } else if (holder instanceof OutcomingLinkPreviewMessageViewHolder) {
            OutcomingLinkPreviewMessageViewHolder holderInstance = (OutcomingLinkPreviewMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
            holderInstance.adjustIfNoteToSelf(chatActivity.getCurrentConversation());

        } else if (holder instanceof IncomingVoiceMessageViewHolder) {
            IncomingVoiceMessageViewHolder holderInstance = (IncomingVoiceMessageViewHolder) holder;
            holderInstance.assignVoiceMessageInterface(chatActivity);
            holderInstance.assignCommonMessageInterface(chatActivity);
        } else if (holder instanceof OutcomingVoiceMessageViewHolder) {
            OutcomingVoiceMessageViewHolder holderInstance = (OutcomingVoiceMessageViewHolder) holder;
            holderInstance.assignVoiceMessageInterface(chatActivity);
            holderInstance.assignCommonMessageInterface(chatActivity);
            holderInstance.adjustIfNoteToSelf(chatActivity.getCurrentConversation());

        } else if (holder instanceof PreviewMessageViewHolder) {
            PreviewMessageViewHolder holderInstance = (PreviewMessageViewHolder) holder;
            holderInstance.assignPreviewMessageInterface(chatActivity);
            holderInstance.assignCommonMessageInterface(chatActivity);

        } else if (holder instanceof SystemMessageViewHolder) {
            SystemMessageViewHolder holderInstance = (SystemMessageViewHolder) holder;
            holderInstance.assignSystemMessageInterface(chatActivity);

        } else if (holder instanceof IncomingDeckCardViewHolder) {
            IncomingDeckCardViewHolder holderInstance = (IncomingDeckCardViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
        } else if (holder instanceof OutcomingDeckCardViewHolder) {
            OutcomingDeckCardViewHolder holderInstance = (OutcomingDeckCardViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
            holderInstance.adjustIfNoteToSelf(chatActivity.getCurrentConversation());

        } else if (holder instanceof IncomingPollMessageViewHolder) {
            IncomingPollMessageViewHolder holderInstance = (IncomingPollMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
        } else if (holder instanceof OutcomingPollMessageViewHolder) {
            OutcomingPollMessageViewHolder holderInstance = (OutcomingPollMessageViewHolder) holder;
            holderInstance.assignCommonMessageInterface(chatActivity);
            holderInstance.adjustIfNoteToSelf(chatActivity.getCurrentConversation());
        }

        super.onBindViewHolder(holder, position);
    }
}
