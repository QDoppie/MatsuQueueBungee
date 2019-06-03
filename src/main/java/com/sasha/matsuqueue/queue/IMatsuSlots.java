package com.sasha.matsuqueue.queue;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Interface that defines and keeps track of the amount of slots on destination server
 */
public interface IMatsuSlots {

    int getAvailableSlots();

    /**
     * Return the total amount of slots
     *
     * @param global should we include the slots from other instances of IMatsuSlots?
     */
    int getTotalSlots(boolean global);

    void queuePlayer(ProxiedPlayer player);

    boolean needsQueueing();

    void associateQueue(IMatsuQueue queue);

    ConcurrentHashMap<String, IMatsuQueue> getAssociatedQueues();

    String getPermission();

}