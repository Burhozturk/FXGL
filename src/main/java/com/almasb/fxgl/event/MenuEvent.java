/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.almasb.fxgl.event;

import java.util.Optional;

import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.event.EventType;

public final class MenuEvent extends Event {

    private static final long serialVersionUID = 1L;

    /**
     * Common supertype for all menu event types.
     */
    public static final EventType<MenuEvent> ANY =
            new EventType<MenuEvent>(Event.ANY, "MENU");

    public static final EventType<MenuEvent> RESUME =
            new EventType<MenuEvent>(MenuEvent.ANY, "RESUME");

    public static final EventType<MenuEvent> NEW_GAME =
            new EventType<MenuEvent>(MenuEvent.ANY, "NEW_GAME");

    public static final EventType<MenuEvent> SAVE =
            new EventType<MenuEvent>(MenuEvent.ANY, "SAVE");

    public static final EventType<MenuEvent> LOAD =
            new EventType<MenuEvent>(MenuEvent.ANY, "LOAD");

    public static final EventType<MenuEvent> EXIT =
            new EventType<MenuEvent>(MenuEvent.ANY, "EXIT");

    public MenuEvent(EventType<? extends Event> eventType) {
        this(null, null, eventType, null);
    }

    public MenuEvent(Object source, EventTarget target, EventType<? extends Event> eventType) {
        this(source, target, eventType, null);
    }

    public MenuEvent(Object source, EventTarget target, EventType<? extends Event> eventType, Object data) {
        super(source, target, eventType);
        this.data = Optional.ofNullable(data);
    }

    private final Optional<Object> data;

    public Optional<Object> getData() {
        return data;
    }

    @SuppressWarnings("unchecked")
    @Override
    public EventType<MenuEvent> getEventType() {
        return (EventType<MenuEvent>) super.getEventType();
    }
}