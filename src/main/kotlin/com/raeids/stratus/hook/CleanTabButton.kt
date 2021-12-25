package com.raeids.stratus.hook

import gg.essential.universal.UResolution

class CleanTabButton(buttonId: Int, x: Int, widthIn: Int, heightIn: Int, private val chatTab: ChatTab) :
    CleanButton(buttonId, { x }, {
                             UResolution.scaledHeight - 26
    }, widthIn, heightIn, chatTab.name) {

    override fun onMousePress() {
        ChatTabs.currentTab = chatTab
    }

    override fun isEnabled(): Boolean {
        return chatTab != ChatTabs.currentTab
    }
}