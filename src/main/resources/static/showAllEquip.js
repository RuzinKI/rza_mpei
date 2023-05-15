async function getAllEquip() {
    const res = await fetch("http://localhost:8080/api/allEquip");
    const equips = await res.json();

    equips.forEach(equip => {
        addEquip(equip);
    });

}


function addEquip(equip) {
    equipToHTML(equip);
    // newUserDelete(equip);
    // newUserEdit(equip);
}

window.addEventListener('DOMContentLoaded', getAllEquip);

function equipToHTML({codeScore, numberObject, name, costBalance, dataIn, dataOut, user, file, tags}) {
    const tbody = document.getElementById('dataeq');
    let strTags = '';
    let strFiles = '';

    if (tags !== undefined) {
        tags.forEach((tag) => {
            strTags += tag.name + ' ';
        })
    }
    if (file !== undefined) {
        file.forEach((doc) => {
            strFiles += doc.name + ' ';
        })
    }


    tbody.insertAdjacentHTML('beforeend', `

    <tr id="equip${numberObject}" >
         <td class="numberObjectvv ggft">${numberObject}</td>
         <td class="codeScorevv ggft">${codeScore}</td>
         <td class="namevv ggft" title="${name}"> ${name}</td>
         <td class="dateInOut ggft">${dataIn}</td>
         <td class="dateInOut ggft">${dataOut}</td>
         <td class="userfio ggft">${user}</td>
         <td class="strTags ggft">${strTags}</td>
         <td class="strFiles ggft">${strFiles}</td>
    </tr>`)
}


