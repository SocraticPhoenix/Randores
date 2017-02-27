/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 socraticphoenix@gmail.com
 * Copyright (c) 2016 contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.gmail.socraticphoenix.forge.randore.item;

import com.gmail.socraticphoenix.forge.randore.component.CraftableType;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlexibleItemRegistry {
    private static List<FlexibleMaterial> materials = Collections.synchronizedList(new ArrayList<FlexibleMaterial>());
    private static List<FlexibleStick> sticks = Collections.synchronizedList(new ArrayList<FlexibleStick>());
    private static List<FlexibleHoe> hoes = Collections.synchronizedList(new ArrayList<FlexibleHoe>());
    private static List<FlexibleSword> swords = Collections.synchronizedList(new ArrayList<FlexibleSword>());
    private static List<FlexibleAxe> axes = Collections.synchronizedList(new ArrayList<FlexibleAxe>());
    private static List<FlexiblePickaxe> pickaxes = Collections.synchronizedList(new ArrayList<FlexiblePickaxe>());
    private static List<FlexibleSpade> spades = Collections.synchronizedList(new ArrayList<FlexibleSpade>());
    private static List<FlexibleItemArmor> helmets = Collections.synchronizedList(new ArrayList<FlexibleItemArmor>());
    private static List<FlexibleItemArmor> chestplates = Collections.synchronizedList(new ArrayList<FlexibleItemArmor>());
    private static List<FlexibleItemArmor> leggings = Collections.synchronizedList(new ArrayList<FlexibleItemArmor>());
    private static List<FlexibleItemArmor> boots = Collections.synchronizedList(new ArrayList<FlexibleItemArmor>());

    public static Item get(CraftableType type, int index) {
        switch (type) {
            case AXE:
                return getAxe(index);
            case HOE:
                return getHoe(index);
            case PICKAXE:
                return getPickaxe(index);
            case SHOVEL:
                return getSpade(index);
            case SWORD:
                return getSword(index);
            case STICK:
                return getStick(index);
            case BOOTS:
                return getBoots(index);
            case CHESTPLATE:
                return getChestplate(index);
            case HELMET:
                return getHelmet(index);
            case LEGGINGS:
                return getLeggings(index);
            case BRICKS:
            default:
                throw new IllegalArgumentException("Invalid craftable type for item; " + type);
        }
    }

    public static FlexibleItemArmor getBoots(int index) {
        return FlexibleItemRegistry.boots.get(index);
    }

    public static List<FlexibleItemArmor> getBoots() {
        return FlexibleItemRegistry.boots;
    }

    public static void addBoots(FlexibleItemArmor armor) {
        FlexibleItemRegistry.boots.add(armor);
    }

    public static FlexibleItemArmor getLeggings(int index) {
        return FlexibleItemRegistry.leggings.get(index);
    }

    public static List<FlexibleItemArmor> getLeggings() {
        return FlexibleItemRegistry.leggings;
    }

    public static void addLeggings(FlexibleItemArmor armor) {
        FlexibleItemRegistry.leggings.add(armor);
    }

    public static FlexibleItemArmor getChestplate(int index) {
        return FlexibleItemRegistry.chestplates.get(index);
    }

    public static List<FlexibleItemArmor> getChestplates() {
        return FlexibleItemRegistry.chestplates;
    }

    public static void addChestplate(FlexibleItemArmor armor) {
        FlexibleItemRegistry.chestplates.add(armor);
    }

    public static FlexibleItemArmor getHelmet(int index) {
        return FlexibleItemRegistry.helmets.get(index);
    }

    public static List<FlexibleItemArmor> getHelmets() {
        return FlexibleItemRegistry.helmets;
    }

    public static void addHelmet(FlexibleItemArmor armor) {
        FlexibleItemRegistry.helmets.add(armor);
    }

    public static FlexibleStick getStick(int index) {
        return FlexibleItemRegistry.sticks.get(index);
    }

    public static List<FlexibleStick> getSticks() {
        return FlexibleItemRegistry.sticks;
    }

    public static void addStick(FlexibleStick stick) {
        FlexibleItemRegistry.sticks.add(stick);
    }

    public static FlexibleSpade getSpade(int index) {
        return FlexibleItemRegistry.spades.get(index);
    }

    public static List<FlexibleSpade> getSpades() {
        return FlexibleItemRegistry.spades;
    }

    public static void addSpade(FlexibleSpade spade) {
        FlexibleItemRegistry.spades.add(spade);
    }

    public static FlexiblePickaxe getPickaxe(int index) {
        return FlexibleItemRegistry.pickaxes.get(index);
    }

    public static List<FlexiblePickaxe> getPickaxes() {
        return FlexibleItemRegistry.pickaxes;
    }

    public static void addPickaxe(FlexiblePickaxe pickaxe) {
        FlexibleItemRegistry.pickaxes.add(pickaxe);
    }

    public static FlexibleAxe getAxe(int index) {
        return FlexibleItemRegistry.axes.get(index);
    }

    public static List<FlexibleAxe> getAxes() {
        return FlexibleItemRegistry.axes;
    }

    public static void addAxe(FlexibleAxe axe) {
        FlexibleItemRegistry.axes.add(axe);
    }

    public static FlexibleSword getSword(int index) {
        return FlexibleItemRegistry.swords.get(index);
    }

    public static List<FlexibleSword> getSwords() {
        return FlexibleItemRegistry.swords;
    }

    public static void addSword(FlexibleSword sword) {
        FlexibleItemRegistry.swords.add(sword);
    }

    public static FlexibleHoe getHoe(int index) {
        return FlexibleItemRegistry.hoes.get(index);
    }

    public static List<FlexibleHoe> getHoes() {
        return FlexibleItemRegistry.hoes;
    }

    public static void addHoe(FlexibleHoe hoe) {
        FlexibleItemRegistry.hoes.add(hoe);
    }

    public static FlexibleMaterial getMaterial(int index) {
        return FlexibleItemRegistry.materials.get(index);
    }

    public static List<FlexibleMaterial> getMaterials() {
        return FlexibleItemRegistry.materials;
    }

    public static void addMaterial(FlexibleMaterial material) {
        FlexibleItemRegistry.materials.add(material);
    }

}
